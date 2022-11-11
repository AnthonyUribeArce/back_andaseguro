package pe.edu.upc.project.andaseguro.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.project.andaseguro.entities.Complaint;
import pe.edu.upc.project.andaseguro.entities.Department;
import pe.edu.upc.project.andaseguro.repositories.IComplaintRepository;
import pe.edu.upc.project.andaseguro.servicesinterfaces.IComplaintService;

import java.util.List;
import java.util.Optional;

@Service
public class ComplaintServiceImpl implements IComplaintService {

    @Autowired
    private IComplaintRepository complaintRepository;

    @Override
    public Boolean insert(Complaint complaint) {
        Complaint objComplaint = complaintRepository.save(complaint);
        if (objComplaint == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public List<Complaint> list() {
        return complaintRepository.findAll();
    }

    @Override
    public void delete(int idComplaint) {
    complaintRepository.deleteById(idComplaint);
    }

    @Override
    public List<Complaint> searchName(String nameComplaint) {
        return complaintRepository.searchName(nameComplaint);
    }

    @Override
    public Optional<Complaint> listarId(int idComplate) {
        return complaintRepository.findById(idComplate);
    }
}
