package dev.expensetracker.services.interfaces;

import dev.expensetracker.models.Role;

public interface RoleServiceInterface {
    void saveRole(Role role);
    void updateRole(Long id, Role role);
    void patchRole(Long id, Role role);
    void deleteRole(Long id);
    void addRoleToUser(String username, String roleName);
}
