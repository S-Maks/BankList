package com.bank.service.impl;

import com.bank.Application;
import com.bank.model.Account;
import com.bank.repository.AccountRepository;
import com.bank.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Application.class})
class AccountServiceImplTest {
    @Autowired
    private AccountRepository accountRepository;

    @Test
    void findAll() {
        List<Account> accountList = accountRepository.findAll();
        for (Account account : accountList) {
            System.out.println(account.getAccountId() + " " + account.getAccount() + " " + account.getUser().getSureName() + " " + account.getUser().getSureName());
        }
    }
}