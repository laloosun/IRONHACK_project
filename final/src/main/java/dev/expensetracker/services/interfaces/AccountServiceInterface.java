package dev.expensetracker.services.interfaces;

import dev.expensetracker.models.Account;

import java.util.List;

public interface AccountServiceInterface {
    Account saveAccount(Account account);
    List<Account> getAccounts();
}
