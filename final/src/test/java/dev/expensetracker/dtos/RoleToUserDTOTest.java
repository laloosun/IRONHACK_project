package dev.expensetracker.dtos;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoleToUserDTOTest {

    @Test
    void testNoArgsConstructor() {
        RoleToUserDTO roleToUserDTO = new RoleToUserDTO();
        assertThat(roleToUserDTO.getUsername()).isNull();
        assertThat(roleToUserDTO.getRoleName()).isNull();
    }

    @Test
    void testSettersAndGetters() {
        RoleToUserDTO roleToUserDTO = new RoleToUserDTO();
        roleToUserDTO.setUsername("user");
        roleToUserDTO.setRoleName("role");
        assertThat(roleToUserDTO.getUsername()).isEqualTo("user");
        assertThat(roleToUserDTO.getRoleName()).isEqualTo("role");
    }

    @Test
    void testToString() {
        RoleToUserDTO roleToUserDTO = new RoleToUserDTO();
        roleToUserDTO.setUsername("user");
        roleToUserDTO.setRoleName("role");
        assertThat(roleToUserDTO.toString()).contains("user", "role");
    }

    @Test
    void testEquals() {
        RoleToUserDTO roleToUserDTO1 = new RoleToUserDTO();
        roleToUserDTO1.setUsername("user");
        roleToUserDTO1.setRoleName("role");

        RoleToUserDTO roleToUserDTO2 = new RoleToUserDTO();
        roleToUserDTO2.setUsername("user");
        roleToUserDTO2.setRoleName("role");

        assertThat(roleToUserDTO1).isEqualTo(roleToUserDTO2);
    }

    @Test
    void testHashCode() {
        RoleToUserDTO roleToUserDTO1 = new RoleToUserDTO();
        roleToUserDTO1.setUsername("user");
        roleToUserDTO1.setRoleName("role");

        RoleToUserDTO roleToUserDTO2 = new RoleToUserDTO();
        roleToUserDTO2.setUsername("user");
        roleToUserDTO2.setRoleName("role");

        assertThat(roleToUserDTO1.hashCode()).isEqualTo(roleToUserDTO2.hashCode());
    }
}
