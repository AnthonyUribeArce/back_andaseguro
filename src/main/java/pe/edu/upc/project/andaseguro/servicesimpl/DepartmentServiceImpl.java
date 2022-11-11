package pe.edu.upc.project.andaseguro.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project.andaseguro.entities.Department;
import pe.edu.upc.project.andaseguro.entities.Province;
import pe.edu.upc.project.andaseguro.repositories.IDepartmentRepository;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IDepartmentService;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements IDepartmentService {

    @Autowired
    private IDepartmentRepository departmentRepository;

    @Override
    public void insert(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public List<Department> list() {
        return departmentRepository.findAll();
    }

    @Override
    public void delete(int idDepartment) {
        departmentRepository.deleteById(idDepartment);
    }

    @Override
    public List<Department> searchName(String nameDepartment) {
        return departmentRepository.searchName(nameDepartment);
    }

    @Override
    public Optional<Department> listarId(int idDepartment) {
        return departmentRepository.findById(idDepartment);
    }
}
