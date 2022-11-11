package pe.edu.upc.project.andaseguro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.project.andaseguro.entities.User;

import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<User,Integer> {
    @Query("from User u where u.NUserName like %:NUserName%")
    List<User> searchName(@Param("NUserName")String NUserName);
}
