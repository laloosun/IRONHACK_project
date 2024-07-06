package dev.expensetracker.dtos;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LoginRequestTest {

    @Test
    void testNoArgsConstructor() {
        LoginRequest loginRequest = new LoginRequest();
        assertThat(loginRequest.getUsername()).isNull();
        assertThat(loginRequest.getPassword()).isNull();
    }

    @Test
    void testAllArgsConstructor() {
        LoginRequest loginRequest = new LoginRequest("user", "pass");
        assertThat(loginRequest.getUsername()).isEqualTo("user");
        assertThat(loginRequest.getPassword()).isEqualTo("pass");
    }

    @Test
    void testSettersAndGetters() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername("newuser");
        loginRequest.setPassword("newpass");
        assertThat(loginRequest.getUsername()).isEqualTo("newuser");
        assertThat(loginRequest.getPassword()).isEqualTo("newpass");
    }
}