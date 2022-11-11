package pe.edu.upc.project.andaseguro.servicesinterfaces;

import pe.edu.upc.project.andaseguro.entities.Complaint;
import pe.edu.upc.project.andaseguro.entities.Direction;

import java.util.List;
import java.util.Optional;

public interface IComplaintService {
    public Boolean insert(Complaint complaint);
    public List<Complaint> list();
    public void delete(int idComplaint);
    List<Complaint> searchName(String nameComplaint);
    public Optional<Complaint> listarId(int idComplate);
}
