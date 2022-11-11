package pe.edu.upc.project.andaseguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.project.andaseguro.entities.Driver;

import java.util.List;

@Repository
public interface IDriverRepository extends JpaRepository<Driver,Integer> {

    @Query("from Driver d where d.user.NUserName like %:NUserName%")
    List<Driver> searchName(@Param("NUserName")String NUserName);
}
