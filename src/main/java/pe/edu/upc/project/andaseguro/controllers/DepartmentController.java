package pe.edu.upc.project.andaseguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project.andaseguro.entities.Complaint;
import pe.edu.upc.project.andaseguro.entities.Department;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IDepartmentService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departamentos")
public class DepartmentController {

    @Autowired
    private IDepartmentService departmentService;

    @PostMapping
    public void registrar(@RequestBody Department p) {
        departmentService.insert(p);
    }

    @GetMapping
    public List<Department> listar() {
        return departmentService.list();
    }

    @PutMapping
    public void modificar(@RequestBody Department d) {
        departmentService.insert(d);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        departmentService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Department> buscar(@RequestBody Department d){
        return departmentService.searchName(d.getNDepartment());
    }
    @GetMapping("/{id}")
    public Optional<Department> listarId(@PathVariable("id") Integer id) {
        return departmentService.listarId(id);
    }

}
