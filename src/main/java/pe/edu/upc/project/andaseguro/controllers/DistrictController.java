package pe.edu.upc.project.andaseguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project.andaseguro.entities.Department;
import pe.edu.upc.project.andaseguro.entities.District;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IDistrictService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/distritos")
public class DistrictController {

    @Autowired
    private IDistrictService districtService;

    @PostMapping
    public void registrar(@RequestBody District d) {
        districtService.insert(d);
    }

    @GetMapping
    public List<District> listar() {
        return districtService.list();
    }

    @PutMapping
    public void modificar(@RequestBody District d) {
        districtService.insert(d);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        districtService.delete(id);
    }

    @PostMapping("/buscar")
    public List<District> buscar(@RequestBody District di) {
        return districtService.searchName(di.getNDistrict());
    }
    @GetMapping("/{id}")
    public Optional<District> listarId(@PathVariable("id") Integer id) {
        return districtService.listarId(id);
    }
}
