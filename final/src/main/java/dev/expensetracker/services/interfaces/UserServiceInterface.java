package dev.expensetracker.services.interfaces;

import dev.expensetracker.models.User;

import java.util.List;

public interface UserServiceInterface {

    void saveUser(User user);

    User getUser(String username);

    List<User> getUsers();
}

