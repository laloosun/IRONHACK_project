package dev.v5tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> findAll() {
        return accountRepository.findAll();

        public Account save(Account account) {
            return accountRepository.save(account);
        }

        public void delete(Long id) {
            accountRepository.deleteById(id);
        }

        public Account findById(Long id) {
            return accountRepository.findById(id).orElse(null);
        }
    }

}
