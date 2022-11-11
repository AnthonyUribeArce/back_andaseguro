package pe.edu.upc.project.andaseguro.servicesinterfaces;

import pe.edu.upc.project.andaseguro.entities.Pedestrian;

import java.util.List;

public interface IPedestrianService {

    public Boolean insert(Pedestrian pedestrian);
    public List<Pedestrian> list();
    public void delete(int idPedestrian);
    List<Pedestrian> searchName(String namePedestrian);
}
