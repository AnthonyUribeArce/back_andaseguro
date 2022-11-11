package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "District")
public class District implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDistric;

    @Column(name = "NDistrict", length = 45, nullable = false)
    private String NDistrict;

    @ManyToOne
    @JoinColumn(name = "idProvince", nullable = false)
    private Province province;

    public District() {
    }

    public District(int idDistric, String NDistrict, Province province) {
        this.idDistric = idDistric;
        this.NDistrict = NDistrict;
        this.province = province;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public int getIdDistric() {
        return idDistric;
    }

    public String getNDistrict() {
        return NDistrict;
    }

    public void setIdDistric(int idDistric) {
        this.idDistric = idDistric;
    }

    public void setNDistrict(String NDistrict) {
        this.NDistrict = NDistrict;
    }
}
