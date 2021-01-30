package com.bank.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users", schema = "public", catalog = "bank")
public class User {
    @Id
    @Column(name = "iduser")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String sureName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    //@JoinColumn(name = "iduser")
    private List<Account> accountList;
}
