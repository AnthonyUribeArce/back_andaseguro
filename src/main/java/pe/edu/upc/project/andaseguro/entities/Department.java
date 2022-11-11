package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;

@Entity
@Table(name = "Department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDepartment;

    @Column(name = "NDepartment", length = 45, nullable = false)
    private String NDepartment;

    public Department() {
    }

    public Department(int idDepartment, String NDepartment) {
        this.idDepartment = idDepartment;
        this.NDepartment = NDepartment;
    }

    public int getIdDepartment() {
        return idDepartment;
    }

    public String getNDepartment() {
        return NDepartment;
    }

    public void setIdDepartment(int idDepartment) {
        this.idDepartment = idDepartment;
    }

    public void setNDepartment(String NDepartment) {
        this.NDepartment = NDepartment;
    }
}
