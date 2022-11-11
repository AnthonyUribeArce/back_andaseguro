package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;

@Entity
@Table(name = "Zone")
public class Zone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idZone;

    @Column(name = "NZone", length = 45, nullable = false)
    private String NZone;

    @Column(name = "CFlag", nullable = false)
    private Boolean CFlag;

    @Column(name = "CLength", nullable = false)
    private int CLength;

    public Zone() {
    }

    public Zone(int idZone, String NZone, Boolean CFlag, int CLength) {
        this.idZone = idZone;
        this.NZone = NZone;
        this.CFlag = CFlag;
        this.CLength = CLength;
    }

    public int getIdZone() {
        return idZone;
    }

    public void setIdZone(int idZone) {
        this.idZone = idZone;
    }

    public String getNZone() {
        return NZone;
    }

    public void setNZone(String NZone) {
        this.NZone = NZone;
    }

    public Boolean getCFlag() {
        return CFlag;
    }

    public void setCFlag(Boolean CFlag) {
        this.CFlag = CFlag;
    }

    public int getCLength() {
        return CLength;
    }

    public void setCLength(int CLength) {
        this.CLength = CLength;
    }
}
