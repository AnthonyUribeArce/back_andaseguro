package pe.edu.upc.project.andaseguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.project.andaseguro.entities.Complaint;
import pe.edu.upc.project.andaseguro.entities.Pedestrian;

import java.util.List;

@Repository
public interface IPedestrianRepository extends JpaRepository<Pedestrian,Integer> {
    @Query("from Pedestrian p where p.user.NUserName like %:NUserName%")
    List<Pedestrian> searchName(@Param("NUserName")String NUserName);
}
