package dev.expensetracker.controllers.impl;

import dev.expensetracker.dtos.RoleToUserDTO;
import dev.expensetracker.models.Role;
import dev.expensetracker.services.interfaces.RoleServiceInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class RoleControllerTest {

    @Mock
    private RoleServiceInterface roleService;

    @InjectMocks
    private RoleController roleController;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(roleController).build();
    }

    @Test
    void testSaveRole() throws Exception {
        Role role = new Role(1L, "ROLE_USER");

        doNothing().when(roleService).saveRole(any(Role.class));

        mockMvc.perform(post("/api/roles")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"name\":\"ROLE_USER\"}"))
                .andExpect(status().isCreated());

        verify(roleService, times(1)).saveRole(any(Role.class));
        verifyNoMoreInteractions(roleService);
    }

    @Test
    void testUpdateRole() throws Exception {
        Role role = new Role(1L, "ROLE_ADMIN");

        doNothing().when(roleService).updateRole(eq(1L), any(Role.class));

        mockMvc.perform(put("/api/roles/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"name\":\"ROLE_ADMIN\"}"))
                .andExpect(status().isOk());

        verify(roleService, times(1)).updateRole(eq(1L), any(Role.class));
        verifyNoMoreInteractions(roleService);
    }

    @Test
    void testPatchRole() throws Exception {
        Role role = new Role(1L, "ROLE_ADMIN");

        doNothing().when(roleService).patchRole(eq(1L), any(Role.class));

        mockMvc.perform(patch("/api/roles/1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"id\":1,\"name\":\"ROLE_ADMIN\"}"))
                .andExpect(status().isOk());

        verify(roleService, times(1)).patchRole(eq(1L), any(Role.class));
        verifyNoMoreInteractions(roleService);
    }

    @Test
    void testDeleteRole() throws Exception {
        doNothing().when(roleService).deleteRole(eq(1L));

        mockMvc.perform(delete("/api/roles/1"))
                .andExpect(status().isNoContent());

        verify(roleService, times(1)).deleteRole(eq(1L));
        verifyNoMoreInteractions(roleService);
    }

    @Test
    void testAddRoleToUser() throws Exception {
        RoleToUserDTO roleToUserDTO = new RoleToUserDTO();
        roleToUserDTO.setUsername("johndoe");
        roleToUserDTO.setRoleName("ROLE_USER");

        doNothing().when(roleService).addRoleToUser(anyString(), anyString());

        mockMvc.perform(post("/api/roles/add-to-user")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"username\":\"johndoe\",\"roleName\":\"ROLE_USER\"}"))
                .andExpect(status().isNoContent());

        verify(roleService, times(1)).addRoleToUser(anyString(), anyString());
        verifyNoMoreInteractions(roleService);
    }
}
