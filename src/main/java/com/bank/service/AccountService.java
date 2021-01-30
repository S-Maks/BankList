package com.bank.service;

import com.bank.model.Account;
import com.bank.model.User;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
}
