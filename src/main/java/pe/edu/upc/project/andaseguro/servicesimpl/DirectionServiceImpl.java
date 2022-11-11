package pe.edu.upc.project.andaseguro.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project.andaseguro.entities.Direction;
import pe.edu.upc.project.andaseguro.repositories.IDirectionRepository;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IDirectionService;

import java.util.List;
import java.util.Optional;

@Service
public class DirectionServiceImpl implements IDirectionService {

    @Autowired
    private IDirectionRepository directionRepository;

    @Override
    public Boolean insert(Direction direction) {

        Direction objDirection = directionRepository.save(direction);
        if (objDirection == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public List<Direction> list() {
        return directionRepository.findAll();
    }

    @Override
    public void delete(int idDirection) {
    directionRepository.deleteById(idDirection);
    }

    @Override
    public List<Direction> searchName(String nameDirection) {
        return directionRepository.searchName(nameDirection);
    }

    @Override
    public Optional<Direction> listarId(int idDirection) {
        return directionRepository.findById(idDirection);
    }
}
