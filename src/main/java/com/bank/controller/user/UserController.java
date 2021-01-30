package com.bank.controller.user;

import com.bank.model.Account;
import com.bank.model.User;
import com.bank.service.AccountService;
import com.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AccountService accountService;

    @GetMapping("/user")
    public String user(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users",users);
        return "user/showUser";
    }

    @GetMapping("/richUser")
    public String richUser(Model model){
        Optional<User> user = userService.findRichUser();
        user.ifPresent(value -> model.addAttribute("user", value));
        return "user/richUser";
    }
}
