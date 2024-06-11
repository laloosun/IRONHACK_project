package com.expenses.tracker.model;

import jakarta.persistence.*;
import org.springframework.security.core.userdetails.User;

import java.util.Set;

public class Role {

    @Entity
    @Table(name = "roles")
    public class Role {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        @ManyToMany(mappedBy = "roles")
        private Set<User> users;
}
