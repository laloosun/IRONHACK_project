package dev.expensetracker.controllers.interfaces;

import dev.expensetracker.models.User;

import java.util.List;

public interface UserControllerInterface {

    List<User> getUsers();

        void saveUser(User user);
}
