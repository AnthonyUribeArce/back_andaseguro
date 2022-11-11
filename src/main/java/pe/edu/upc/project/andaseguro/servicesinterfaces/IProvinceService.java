package pe.edu.upc.project.andaseguro.servicesinterfaces;

import pe.edu.upc.project.andaseguro.entities.Department;
import pe.edu.upc.project.andaseguro.entities.Direction;
import pe.edu.upc.project.andaseguro.entities.Province;

import java.util.List;
import java.util.Optional;

public interface IProvinceService {

    public Boolean insert(Province province);
    public List<Province> list();
    public void delete(int idProvince);

    List<Province> searchName(String nameProvince);
    public Optional<Province> listarId(int idProvince);
}
