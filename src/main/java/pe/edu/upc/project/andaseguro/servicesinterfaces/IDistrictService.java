package pe.edu.upc.project.andaseguro.servicesinterfaces;



import pe.edu.upc.project.andaseguro.entities.Direction;
import pe.edu.upc.project.andaseguro.entities.District;
import java.util.List;
import java.util.Optional;

public interface IDistrictService {

    public Boolean insert(District district);
    public List<District> list();
    public void delete(int idDistrict);

    List<District> searchName(String nameDistrict);
    public Optional<District> listarId(int idDistrict);
}
