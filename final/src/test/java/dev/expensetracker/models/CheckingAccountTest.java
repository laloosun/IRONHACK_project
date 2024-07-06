package dev.expensetracker.models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheckingAccountTest {

    @Test
    void testNoArgsConstructor() {
        CheckingAccount checkingAccount = new CheckingAccount();
        assertThat(checkingAccount.getId()).isNull();
        assertThat(checkingAccount.getAccountNumber()).isNull();
        assertThat(checkingAccount.getBalance()).isNull();
        assertThat(checkingAccount.getOverdraftLimit()).isNull();
    }

    @Test
    void testAllArgsConstructor() {
        CheckingAccount checkingAccount = new CheckingAccount(1L, "1234567890", 1000.0, 500.0);
        assertThat(checkingAccount.getId()).isEqualTo(1L);
        assertThat(checkingAccount.getAccountNumber()).isEqualTo("1234567890");
        assertThat(checkingAccount.getBalance()).isEqualTo(1000.0);
        assertThat(checkingAccount.getOverdraftLimit()).isEqualTo(500.0);
    }

    @Test
    void testSettersAndGetters() {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setId(1L);
        checkingAccount.setAccountNumber("1234567890");
        checkingAccount.setBalance(1000.0);
        checkingAccount.setOverdraftLimit(500.0);

        assertThat(checkingAccount.getId()).isEqualTo(1L);
        assertThat(checkingAccount.getAccountNumber()).isEqualTo("1234567890");
        assertThat(checkingAccount.getBalance()).isEqualTo(1000.0);
        assertThat(checkingAccount.getOverdraftLimit()).isEqualTo(500.0);
    }

    @Test
    void testEquals() {
        CheckingAccount checkingAccount1 = new CheckingAccount(1L, "1234567890", 1000.0, 500.0);
        CheckingAccount checkingAccount2 = new CheckingAccount(1L, "1234567890", 1000.0, 500.0);
        assertThat(checkingAccount1).isEqualTo(checkingAccount2);
    }

    @Test
    void testHashCode() {
        CheckingAccount checkingAccount1 = new CheckingAccount(1L, "1234567890", 1000.0, 500.0);
        CheckingAccount checkingAccount2 = new CheckingAccount(1L, "1234567890", 1000.0, 500.0);
        assertThat(checkingAccount1.hashCode()).isEqualTo(checkingAccount2.hashCode());
    }
}
