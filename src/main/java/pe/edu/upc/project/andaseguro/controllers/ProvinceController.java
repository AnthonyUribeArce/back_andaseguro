package pe.edu.upc.project.andaseguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project.andaseguro.entities.Department;
import pe.edu.upc.project.andaseguro.entities.Direction;
import pe.edu.upc.project.andaseguro.entities.Province;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IProvinceService;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/provincias")
public class ProvinceController {
    @Autowired
    private IProvinceService provinceService;

    @PostMapping
    public void registrar(@RequestBody Province d) {
        provinceService.insert(d);
    }

    @GetMapping
    public List<Province> listar() {
        return provinceService.list();
    }

    @PutMapping
    public void modificar(@RequestBody Province d) {
        provinceService.insert(d);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        provinceService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Province> buscar(@RequestBody Province pr) {
        return provinceService.searchName(pr.getNProvince());
    }
    @GetMapping("/{id}")
    public Optional<Province> listarId(@PathVariable("id") Integer id) {
        return provinceService.listarId(id);
    }
}
