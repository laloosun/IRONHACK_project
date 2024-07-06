package dev.expensetracker.controllers.interfaces;

import dev.expensetracker.dtos.RoleToUserDTO;
import dev.expensetracker.models.Role;

public interface RoleControllerInterface {
    void saveRole(Role role);
    void updateRole(Long id, Role role);
    void patchRole(Long id, Role role);
    void deleteRole(Long id);
    void addRoleToUser(RoleToUserDTO roleToUserDTO);
}
