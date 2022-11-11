package pe.edu.upc.project.andaseguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.project.andaseguro.entities.Department;

import java.util.List;

@Repository
public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

    @Query("from Department d where d.NDepartment like %:NDepartment%")
    List<Department> searchName(@Param("NDepartment")String NDepartment);
}

