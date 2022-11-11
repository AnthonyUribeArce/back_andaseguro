package pe.edu.upc.project.andaseguro.servicesinterfaces;
import pe.edu.upc.project.andaseguro.entities.Department;
import java.util.List;
import java.util.Optional;

public interface IDepartmentService {

    public void insert(Department department);
    public List<Department> list();
    public void delete(int idDepartment);
    List<Department> searchName(String nameDepartment);

    public Optional<Department> listarId(int idDepartment);
}
