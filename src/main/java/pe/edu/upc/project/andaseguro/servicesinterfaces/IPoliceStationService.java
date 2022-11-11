package pe.edu.upc.project.andaseguro.servicesinterfaces;

import pe.edu.upc.project.andaseguro.entities.Direction;
import pe.edu.upc.project.andaseguro.entities.PoliceStation;

import java.util.List;
import java.util.Optional;

public interface IPoliceStationService {
    public Boolean insert(PoliceStation policeStation);
    public List<PoliceStation> list();
    public void delete(int idPoliceStation);
    List<PoliceStation> searchName(String namePoliceStation);
    public Optional<PoliceStation> listarId(int idPoliceStation);
}
