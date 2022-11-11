package pe.edu.upc.project.andaseguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project.andaseguro.entities.Pedestrian;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IPedestrianService;

import java.util.List;

@RestController
@RequestMapping("/peatones")
public class PedestrianController {
    @Autowired
    private IPedestrianService pedestrianService;

    @PostMapping
    public void registrar(@RequestBody Pedestrian p) {
        pedestrianService.insert(p);
    }

    @GetMapping
    public List<Pedestrian> listar() {
        return pedestrianService.list();
    }

    @PutMapping
    public void modificar(@RequestBody Pedestrian p) {
        pedestrianService.insert(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pedestrianService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Pedestrian> buscar(@RequestBody Pedestrian pe) {
        return pedestrianService.searchName(pe.getUser().getNUserName());
    }
}
