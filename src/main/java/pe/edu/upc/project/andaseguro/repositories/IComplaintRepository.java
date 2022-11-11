package pe.edu.upc.project.andaseguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.project.andaseguro.entities.Complaint;

import java.util.List;

@Repository
public interface IComplaintRepository extends JpaRepository<Complaint, Integer> {

    @Query("from Complaint c where c.NComplaint like %:NComplaint%")
    List<Complaint> searchName(@Param("NComplaint")String NComplaint);
}
