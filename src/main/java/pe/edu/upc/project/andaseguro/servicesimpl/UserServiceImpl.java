package pe.edu.upc.project.andaseguro.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project.andaseguro.entities.User;
import pe.edu.upc.project.andaseguro.repositories.IUserRepository;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IUserService;

import java.util.List;
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepository userRepository;
    @Override
    public Boolean insert(User user) {
        User objUser = userRepository.save(user);
        if (objUser == null) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public List<User> list() {
        return userRepository.findAll();
    }
    @Override
    public void delete(int idUser) {
    userRepository.deleteById(idUser);
    }
    @Override
    public List<User> searchName(String nameUser) {
        return userRepository.searchName(nameUser);
    }
}
