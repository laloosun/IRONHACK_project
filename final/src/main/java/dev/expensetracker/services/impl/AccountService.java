package dev.expensetracker.services.impl;

import dev.expensetracker.models.Account;
import dev.expensetracker.repositories.AccountRepository;
import dev.expensetracker.services.interfaces.AccountServiceInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountService implements AccountServiceInterface {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account saveAccount(Account account) {
        log.info("Saving new account {} to the database", account.getAccountNumber());
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAccounts() {
        log.info("Fetching all accounts");
        return accountRepository.findAll();
    }
}
