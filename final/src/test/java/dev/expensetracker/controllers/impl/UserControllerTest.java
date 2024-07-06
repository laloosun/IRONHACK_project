package dev.expensetracker.controllers.impl;

import dev.expensetracker.models.Role;
import dev.expensetracker.models.User;
import dev.expensetracker.services.interfaces.UserServiceInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class UserControllerTest {

    @Mock
    private UserServiceInterface userService;

    @InjectMocks
    private UserController userController;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }


    @Test
    void testSaveUser() throws Exception {
        Role role = new Role(); // Assuming Role has a no-args constructor or adjust accordingly
        User user = new User(1L, "John", "Doe", "johndoe@example.com", Collections.singleton(role));

        doNothing().when(userService).saveUser(any(User.class));

        mockMvc.perform(post("/api/users")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"firstName\":\"John\",\"lastName\":\"Doe\",\"email\":\"johndoe@example.com\"}"))
                .andExpect(status().isCreated());

        verify(userService, times(1)).saveUser(any(User.class));
        verifyNoMoreInteractions(userService);
    }
}
