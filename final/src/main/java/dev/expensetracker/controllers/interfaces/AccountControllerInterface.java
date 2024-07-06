package dev.expensetracker.controllers.interfaces;

import dev.expensetracker.models.Account;

import java.util.List;

public interface AccountControllerInterface {
    List<Account> getAccounts();
    void saveAccount(Account account);
}
