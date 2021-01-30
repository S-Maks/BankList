package com.bank.repository;

import com.bank.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    @Transactional
    @Query(value = "SELECT a.user.userid from Account a GROUP BY a.user.userid ORDER BY sum(a.account) desc")
    List<Integer> findRichUsers();
}
