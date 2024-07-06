package dev.expensetracker.services.impl;

import dev.expensetracker.models.Role;
import dev.expensetracker.models.User;
import dev.expensetracker.repositories.RoleRepository;
import dev.expensetracker.repositories.UserRepository;
import dev.expensetracker.services.interfaces.RoleServiceInterface;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleService implements RoleServiceInterface {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void saveRole(Role role) {
        log.info("Saving new role {} to the database", role.getName());
        roleRepository.save(role);
    }

    @Override
    public void updateRole(Long id, Role role) {
        log.info("Updating role {} in the database", role.getName());
        Role existingRole = roleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Role not found"));
        existingRole.setName(role.getName());
        roleRepository.save(existingRole);
    }

    @Override
    public void patchRole(Long id, Role role) {
        log.info("Patching role {} in the database", role.getName());
        Role existingRole = roleRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Role not found"));
        if (role.getName() != null) {
            existingRole.setName(role.getName());
        }
        roleRepository.save(existingRole);
    }

    @Override
    public void deleteRole(Long id) {
        log.info("Deleting role with id {} from the database", id);
        roleRepository.deleteById(id);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding role {} to user {}", roleName, username);
        User user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
        userRepository.save(user);
    }
}
