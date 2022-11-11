package pe.edu.upc.project.andaseguro.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project.andaseguro.entities.Province;
import pe.edu.upc.project.andaseguro.repositories.IProvinceRepository;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IProvinceService;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceServiceImpl implements IProvinceService {

    @Autowired
    private IProvinceRepository provinceRepository;

    @Override
    public Boolean insert(Province province) {

        Province objProvince = provinceRepository.save(province);
        if (objProvince == null) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public List<Province> list() {
        return provinceRepository.findAll();
    }

    @Override
    public void delete(int idProvince) {
        provinceRepository.deleteById(idProvince);
    }

    @Override
    public List<Province> searchName(String nameProvince) {
        return provinceRepository.searchName(nameProvince);
    }

    @Override
    public Optional<Province> listarId(int idProvince) {
        return provinceRepository.findById(idProvince);
    }
}
