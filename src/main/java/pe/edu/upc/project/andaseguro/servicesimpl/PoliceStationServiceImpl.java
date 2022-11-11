package pe.edu.upc.project.andaseguro.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project.andaseguro.entities.PoliceStation;
import pe.edu.upc.project.andaseguro.repositories.IDepartmentRepository;
import pe.edu.upc.project.andaseguro.repositories.IPoliceStationRepository;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IPoliceStationService;

import java.util.List;
import java.util.Optional;

@Service
public class PoliceStationServiceImpl implements IPoliceStationService {

    @Autowired
    private IPoliceStationRepository policeStationRepository;

    @Override
    public Boolean insert(PoliceStation policeStation) {
        PoliceStation objPoliceStation = policeStationRepository.save(policeStation);
        if (objPoliceStation == null) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public List<PoliceStation> list() {
        return policeStationRepository.findAll();
    }

    @Override
    public void delete(int idPoliceStation) {
    policeStationRepository.deleteById(idPoliceStation);
    }

    @Override
    public List<PoliceStation> searchName(String namePoliceStation) {
        return policeStationRepository.searchName(namePoliceStation);
    }

    @Override
    public Optional<PoliceStation> listarId(int idPoliceStation) {
        return policeStationRepository.findById(idPoliceStation);
    }
}
