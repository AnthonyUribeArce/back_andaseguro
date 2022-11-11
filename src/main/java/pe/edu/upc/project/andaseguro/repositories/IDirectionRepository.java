package pe.edu.upc.project.andaseguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.project.andaseguro.entities.Department;
import pe.edu.upc.project.andaseguro.entities.Direction;

import java.util.List;

@Repository
public interface IDirectionRepository extends JpaRepository<Direction, Integer> {

    @Query("from Direction d where d.NUrbanizacion like %:NUrbanizacion%")
    List<Direction> searchName(@Param("NUrbanizacion")String NUrbanizacion);
}
