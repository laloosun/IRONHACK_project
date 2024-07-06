package dev.expensetracker.controllers.impl;

import dev.expensetracker.controllers.interfaces.RoleControllerInterface;
import dev.expensetracker.dtos.RoleToUserDTO;
import dev.expensetracker.models.Role;
import dev.expensetracker.services.interfaces.RoleServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoleController implements RoleControllerInterface {

    @Autowired
    private RoleServiceInterface roleService;

    @PostMapping("/roles")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveRole(@RequestBody Role role) {
        roleService.saveRole(role);
    }

    @PutMapping("/roles/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateRole(@PathVariable Long id, @RequestBody Role role) {
        roleService.updateRole(id, role);
    }

    @PatchMapping("/roles/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void patchRole(@PathVariable Long id, @RequestBody Role role) {
        roleService.patchRole(id, role);
    }

    @DeleteMapping("/roles/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRole(@PathVariable Long id) {
        roleService.deleteRole(id);
    }

    @PostMapping("/roles/add-to-user")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void addRoleToUser(@RequestBody RoleToUserDTO roleToUserDTO) {
        roleService.addRoleToUser(roleToUserDTO.getUsername(), roleToUserDTO.getRoleName());
    }
}
