package pe.edu.upc.project.andaseguro.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project.andaseguro.entities.Driver;
import pe.edu.upc.project.andaseguro.entities.Pedestrian;
import pe.edu.upc.project.andaseguro.repositories.IPedestrianRepository;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IPedestrianService;

import java.util.List;

@Service
public class PedestrianServiceImpl implements IPedestrianService {

    @Autowired
    private IPedestrianRepository pedestrianRepository;
    @Override
    public Boolean insert(Pedestrian pedestrian) {
        Pedestrian objPedestrian = pedestrianRepository.save(pedestrian);
        if (objPedestrian == null) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public List<Pedestrian> list() {
        return pedestrianRepository.findAll();
    }

    @Override
    public void delete(int idPedestrian) {
        pedestrianRepository.deleteById(idPedestrian);
    }

    @Override
    public List<Pedestrian> searchName(String namePedestrian) {
        return pedestrianRepository.searchName(namePedestrian);
    }
}
