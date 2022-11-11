package pe.edu.upc.project.andaseguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.project.andaseguro.entities.Province;

import java.util.List;

@Repository
public interface IProvinceRepository extends JpaRepository<Province, Integer> {

    @Query("from Province p where p.NProvince like %:NProvince%")
    List<Province> searchName(@Param("NProvince")String NProvince);
}
