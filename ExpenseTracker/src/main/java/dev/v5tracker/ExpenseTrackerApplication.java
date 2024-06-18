package dev.v5tracker;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class ExpenseTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpenseTrackerApplication.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }


    @Bean
    CommandLineRunner run(UserService userService, RoleService roleService) {
        return args -> {
            if (roleService.findAllByName("ROLE_USER").isEmpty()) {
                roleService.saveRole(new Role("ROLE_USER"));
            }

            if (roleService.findAllByName("ROLE_ADMIN").isEmpty()) {
                roleService.saveRole(new Role("ROLE_ADMIN"));
            }


            userService.saveUser(new User(null, "John Doe", "john", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "James Smith", "james", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Jane Carry", "jane", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Chris Anderson", "chris", "1234", new ArrayList<>()));

