package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Province")
public class Province implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProvince;

    @Column(name = "NProvince", length = 45, nullable = false)
    private String NProvince;

    @ManyToOne
    @JoinColumn(name = "idDepartment", nullable = false)
    private Department department;

    public Province() {
    }

    public Province(int idProvince, String NProvince, Department department) {
        this.idProvince = idProvince;
        this.NProvince = NProvince;
        this.department = department;
    }

    public int getIdProvince() {
        return idProvince;
    }

    public String getNProvince() {
        return NProvince;
    }

    public void setIdProvince(int idProvince) {
        this.idProvince = idProvince;
    }

    public void setNProvince(String NProvince) {
        this.NProvince = NProvince;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
