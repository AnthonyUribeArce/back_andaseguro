package pe.edu.upc.project.andaseguro.servicesinterfaces;

import pe.edu.upc.project.andaseguro.entities.Driver;

import java.util.List;

public interface IDriverService {

    public Boolean insert(Driver driver);
    public List<Driver> list();
    public void delete(int idDriver);
    List<Driver> searchName(String nameDriver);
}
