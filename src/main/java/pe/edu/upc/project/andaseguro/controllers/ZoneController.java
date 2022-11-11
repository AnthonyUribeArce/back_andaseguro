package pe.edu.upc.project.andaseguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project.andaseguro.entities.Department;
import pe.edu.upc.project.andaseguro.entities.Zone;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IZoneService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/zonas")
public class ZoneController {
    @Autowired
    private IZoneService zoneService;

    @PostMapping
    public void registrar(@RequestBody Zone z) {
        zoneService.insert(z);
    }

    @GetMapping
    public List<Zone> listar() {
        return zoneService.list();
    }

    @PutMapping
    public void modificar(@RequestBody Zone z) {
        zoneService.insert(z);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        zoneService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Zone> buscar(@RequestBody Zone zo) {
        return zoneService.searchName(zo.getNZone());
    }

    @GetMapping("/{id}")
    public Optional<Zone> listarId(@PathVariable("id") Integer id) {
        return zoneService.listarId(id);
    }
}
