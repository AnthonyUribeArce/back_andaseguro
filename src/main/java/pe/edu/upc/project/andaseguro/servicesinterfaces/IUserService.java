package pe.edu.upc.project.andaseguro.servicesinterfaces;

import pe.edu.upc.project.andaseguro.entities.Direction;
import pe.edu.upc.project.andaseguro.entities.User;

import java.util.List;

public interface IUserService {

    public Boolean insert(User user);
    public List<User> list();
    public void delete(int idUser);
    List<User> searchName(String nameUser);
}
