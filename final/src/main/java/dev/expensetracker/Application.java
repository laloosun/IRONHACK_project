package dev.expensetracker;

import dev.expensetracker.models.Role;
import dev.expensetracker.models.User;
import dev.expensetracker.services.interfaces.RoleServiceInterface;
import dev.expensetracker.services.interfaces.UserServiceInterface;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UserServiceInterface userService, RoleServiceInterface roleService) {
        return args -> {
            roleService.saveRole(new Role(null, "ROLE_USER"));
            roleService.saveRole(new Role(null, "ROLE_ADMIN"));

            userService.saveUser(new User(null, "Alice Johnson", "alice", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Bob Brown", "bob", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Carol White", "carol", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "David Green", "david", "1234", new ArrayList<>()));

            roleService.addRoleToUser("alice", "ROLE_USER");
            roleService.addRoleToUser("bob", "ROLE_ADMIN");
            roleService.addRoleToUser("carol", "ROLE_USER");
            roleService.addRoleToUser("david", "ROLE_ADMIN");
            roleService.addRoleToUser("david", "ROLE_USER");
        };
    }

}
