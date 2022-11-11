package pe.edu.upc.project.andaseguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project.andaseguro.entities.Department;
import pe.edu.upc.project.andaseguro.entities.Direction;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IDirectionService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/direcciones")
public class DirectionController {
    @Autowired
    private IDirectionService directionService;

    @PostMapping
    public void registrar(@RequestBody Direction d) {
        directionService.insert(d);
    }

    @GetMapping
    public List<Direction> listar() {
        return directionService.list();
    }

    @PutMapping
    public void modificar(@RequestBody Direction d) {
        directionService.insert(d);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        directionService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Direction> buscar(@RequestBody Direction di) {
        return directionService.searchName(di.getNUrbanizacion());
    }

    @GetMapping("/{id}")
    public Optional<Direction> listarId(@PathVariable("id") Integer id) {
        return directionService.listarId(id);
    }
}
