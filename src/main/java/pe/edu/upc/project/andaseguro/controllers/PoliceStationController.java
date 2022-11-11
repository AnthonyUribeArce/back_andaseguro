package pe.edu.upc.project.andaseguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project.andaseguro.entities.Department;
import pe.edu.upc.project.andaseguro.entities.PoliceStation;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IPoliceStationService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comisarias")
public class PoliceStationController {

    @Autowired
    private IPoliceStationService policeStationService;

    @PostMapping
    public void registrar(@RequestBody PoliceStation p) {
        policeStationService.insert(p);
    }

    @GetMapping
    public List<PoliceStation> listar() {
        return policeStationService.list();
    }

    @PutMapping
    public void modificar(@RequestBody PoliceStation d) {
        policeStationService.insert(d);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        policeStationService.delete(id);
    }

    @PostMapping("/buscar")
    public List<PoliceStation> buscar(@RequestBody PoliceStation d){
        return policeStationService.searchName(d.getNPoliceStation());
    }

    @GetMapping("/{id}")
    public Optional<PoliceStation> listarId(@PathVariable("id") Integer id) {
        return policeStationService.listarId(id);
    }
}
