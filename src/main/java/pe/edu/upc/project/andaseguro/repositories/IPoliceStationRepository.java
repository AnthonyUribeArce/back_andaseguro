package pe.edu.upc.project.andaseguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.project.andaseguro.entities.PoliceStation;

import java.util.List;

@Repository
public interface IPoliceStationRepository extends JpaRepository<PoliceStation, Integer> {

    @Query("from PoliceStation p where p.NPoliceStation like %:NPoliceStation%")
    List<PoliceStation> searchName(@Param("NPoliceStation")String NPoliceStation);
}
