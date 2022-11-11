package pe.edu.upc.project.andaseguro.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project.andaseguro.entities.Complaint;
import pe.edu.upc.project.andaseguro.entities.Driver;
import pe.edu.upc.project.andaseguro.repositories.IDriverRepository;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IDriverService;

import java.util.List;

@Service
public class DriverServiceImpl implements IDriverService {

    @Autowired
    private IDriverRepository driverRepository;
    @Override
    public Boolean insert(Driver driver) {
        Driver objDriver = driverRepository.save(driver);
        if (objDriver == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public List<Driver> list() {
        return driverRepository.findAll();
    }

    @Override
    public void delete(int idDriver) {
        driverRepository.deleteById(idDriver);
    }

    @Override
    public List<Driver> searchName(String nameDriver) {
        return driverRepository.searchName(nameDriver);
    }
}
