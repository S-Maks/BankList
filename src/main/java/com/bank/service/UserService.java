package com.bank.service;

import com.bank.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findRichUser();
}
