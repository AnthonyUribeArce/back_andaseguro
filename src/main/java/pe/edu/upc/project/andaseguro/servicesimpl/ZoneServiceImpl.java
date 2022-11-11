package pe.edu.upc.project.andaseguro.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project.andaseguro.entities.Zone;
import pe.edu.upc.project.andaseguro.repositories.IZoneRepository;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IZoneService;

import java.util.List;
import java.util.Optional;

@Service
public class ZoneServiceImpl implements IZoneService {

    @Autowired
    private IZoneRepository zoneRepository;
    @Override
    public Boolean insert(Zone zone) {
        Zone objZone = zoneRepository.save(zone);
        if (objZone == null) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public List<Zone> list() {
        return zoneRepository.findAll();
    }

    @Override
    public void delete(int idZone) {
        zoneRepository.deleteById(idZone);
    }

    @Override
    public List<Zone> searchName(String nameZone) {
        return zoneRepository.searchName(nameZone);
    }

    @Override
    public Optional<Zone> listarId(int idZone) {
        return zoneRepository.findById(idZone);
    }
}
