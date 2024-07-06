package dev.expensetracker.models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountTest {

    @Test
    void testNoArgsConstructor() {
        Account account = new Account();
        assertThat(account.getId()).isNull();
        assertThat(account.getAccountNumber()).isNull();
        assertThat(account.getBalance()).isNull();
    }

    @Test
    void testAllArgsConstructor() {
        Account account = new Account(1L, "1234567890", 1000.0);
        assertThat(account.getId()).isEqualTo(1L);
        assertThat(account.getAccountNumber()).isEqualTo("1234567890");
        assertThat(account.getBalance()).isEqualTo(1000.0);
    }

    @Test
    void testSettersAndGetters() {
        Account account = new Account();
        account.setId(1L);
        account.setAccountNumber("1234567890");
        account.setBalance(1000.0);

        assertThat(account.getId()).isEqualTo(1L);
        assertThat(account.getAccountNumber()).isEqualTo("1234567890");
        assertThat(account.getBalance()).isEqualTo(1000.0);
    }

    @Test
    void testToString() {
        Account account = new Account(1L, "1234567890", 1000.0);
        assertThat(account.toString()).contains("1", "1234567890", "1000.0");
    }

    @Test
    void testEquals() {
        Account account1 = new Account(1L, "1234567890", 1000.0);
        Account account2 = new Account(1L, "1234567890", 1000.0);
        assertThat(account1).isEqualTo(account2);
    }

    @Test
    void testHashCode() {
        Account account1 = new Account(1L, "1234567890", 1000.0);
        Account account2 = new Account(1L, "1234567890", 1000.0);
        assertThat(account1.hashCode()).isEqualTo(account2.hashCode());
    }
}
