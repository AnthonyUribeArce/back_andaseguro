package pe.edu.upc.project.andaseguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.project.andaseguro.entities.Zone;

import java.util.List;

@Repository
public interface IZoneRepository extends JpaRepository<Zone,Integer> {

    @Query("from Zone z where z.NZone like %:NZone%")
    List<Zone> searchName(@Param("NZone")String NZone);
}
