package pe.edu.upc.project.andaseguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project.andaseguro.entities.User;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IUserService;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping
    public void registrar(@RequestBody User u) {
        userService.insert(u);
    }

    @GetMapping
    public List<User> listar() {
        return userService.list();
    }

    @PutMapping
    public void modificar(@RequestBody User u) {
        userService.insert(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        userService.delete(id);
    }

    @PostMapping("/buscar")
    public List<User> buscar(@RequestBody User us) {
        return userService.searchName(us.getNUserName());
    }
}
