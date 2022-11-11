package pe.edu.upc.project.andaseguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project.andaseguro.entities.Driver;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IDriverService;

import java.util.List;

@RestController
@RequestMapping("/conductores")
public class DriverController {
    @Autowired
    private IDriverService driverService;

    @PostMapping
    public void registrar(@RequestBody Driver d) {
        driverService.insert(d);
    }

    @GetMapping
    public List<Driver> listar() {
        return driverService.list();
    }

    @PutMapping
    public void modificar(@RequestBody Driver d) {
        driverService.insert(d);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        driverService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Driver> buscar(@RequestBody Driver dr) {
        return driverService.searchName(dr.getUser().getNUserName());
    }
}
