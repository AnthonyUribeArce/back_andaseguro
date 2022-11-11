package pe.edu.upc.project.andaseguro.servicesinterfaces;

import pe.edu.upc.project.andaseguro.entities.Direction;
import pe.edu.upc.project.andaseguro.entities.Zone;

import java.util.List;
import java.util.Optional;

public interface IZoneService {
    public Boolean insert(Zone zone);
    public List<Zone> list();
    public void delete(int idZone);
    List<Zone> searchName(String nameZone);
    public Optional<Zone> listarId(int idZone);
}
