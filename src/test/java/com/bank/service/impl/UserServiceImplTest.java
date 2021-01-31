package com.bank.service.impl;

import com.bank.Application;
import com.bank.model.User;
import com.bank.repository.AccountRepository;
import com.bank.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes={Application.class})
class UserServiceImplTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Test
    void findAll() {
        System.out.println(userRepository.findAll().size());
    }

    @Test
    void findRichUser() {
        if (!userRepository.findAll().isEmpty()){
            if(!accountRepository.findAll().isEmpty()){
                int richUser = accountRepository.findRichUsers().get(0);
                System.out.println(userRepository.findById(richUser).get().toString());
            }
        }
    }
}