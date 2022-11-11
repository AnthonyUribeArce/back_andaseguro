package pe.edu.upc.project.andaseguro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.project.andaseguro.entities.Complaint;
import pe.edu.upc.project.andaseguro.entities.Department;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IComplaintService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/denuncias")
public class ComplaintController {

    @Autowired
    private IComplaintService complaintService;

    @PostMapping
    public void registrar(@RequestBody Complaint c) {
        complaintService.insert(c);
    }

    @GetMapping
    public List<Complaint> listar() {
        return complaintService.list();
    }

    @PutMapping
    public void modificar(@RequestBody Complaint c) {
        complaintService.insert(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        complaintService.delete(id);
    }

    @PostMapping("/buscar")
    public List<Complaint> buscar(@RequestBody Complaint co) {
        return complaintService.searchName(co.getNComplaint());
    }
    @GetMapping("/{id}")
    public Optional<Complaint> listarId(@PathVariable("id") Integer id) {
        return complaintService.listarId(id);
    }
}
