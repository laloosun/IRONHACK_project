package dev.final5;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/roles")
@RequiredArgsConstructor
public class RoleController {
    private final RoleService roleService;

    @PostMapping
    public ResponseEntity<Role> saveRole(@RequestBody Role role) {
        return ResponseEntity.ok().body(roleService.saveRole(role));
    }

    @PostMapping("/add-to-user")
    public ResponseEntity<?> addRoleToUser(@RequestBody RoleToUserForm form) {
        roleService.addRoleToUser(form.getUsername(), form.getRoleName());
        return ResponseEntity.ok().build();
    }
}

@Data
class RoleToUserForm {
    private String username;
    private String roleName;
}