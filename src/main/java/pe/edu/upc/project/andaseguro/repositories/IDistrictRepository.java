package pe.edu.upc.project.andaseguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.project.andaseguro.entities.Direction;
import pe.edu.upc.project.andaseguro.entities.District;

import java.util.List;

@Repository
public interface IDistrictRepository extends JpaRepository<District, Integer> {

    @Query("from District d where d.NDistrict like %:NDistrict%")
    List<District> searchName(@Param("NDistrict")String NDistrict);
}
