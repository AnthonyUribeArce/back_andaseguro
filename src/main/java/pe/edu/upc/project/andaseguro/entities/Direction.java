package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Direction")
public class Direction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDirection;

    @Column(name = "NUrbanizacion", length = 45, nullable = false)
    private String NUrbanizacion;

    @Column(name = "NCalle", length = 45, nullable = false)
    private String NCalle;

    @Column(name = "NManzana", length = 4, nullable = false)
    private int NManzana;

    @Column(name = "NLote", length = 4, nullable = false)
    private int NLote;

    @Column(name = "NDepartamento", length = 4, nullable = false)
    private int NDepartamento;

    @ManyToOne
    @JoinColumn(name = "idDistrict", nullable = false)
    private District district;

    public Direction() {
    }

    public Direction(int idDirection, String NUrbanizacion, String NCalle, int NManzana, int NLote, int NDepartamento, District district) {
        this.idDirection = idDirection;
        this.NUrbanizacion = NUrbanizacion;
        this.NCalle = NCalle;
        this.NManzana = NManzana;
        this.NLote = NLote;
        this.NDepartamento = NDepartamento;
        this.district = district;
    }

    public int getIdDirection() {
        return idDirection;
    }

    public String getNUrbanizacion() {
        return NUrbanizacion;
    }

    public String getNCalle() {
        return NCalle;
    }

    public int getNManzana() {
        return NManzana;
    }

    public int getNLote() {
        return NLote;
    }

    public int getNDepartamento() {
        return NDepartamento;
    }

    public void setIdDirection(int idDirection) {
        this.idDirection = idDirection;
    }

    public void setNUrbanizacion(String NUrbanizacion) {
        this.NUrbanizacion = NUrbanizacion;
    }

    public void setNCalle(String NCalle) {
        this.NCalle = NCalle;
    }

    public void setNManzana(int NManzana) {
        this.NManzana = NManzana;
    }

    public void setNLote(int NLote) {
        this.NLote = NLote;
    }

    public void setNDepartamento(int NDepartamento) {
        this.NDepartamento = NDepartamento;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }
}
