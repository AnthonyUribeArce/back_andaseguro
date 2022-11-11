package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Complaint")
public class Complaint implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComplaint;

    @Column(name = "NComplaint", length = 45, nullable = false)
    private String NComplaint;

    @ManyToOne
    @JoinColumn(name = "idPoliceStation", nullable = false)
    private PoliceStation policeStation;

    @ManyToOne
    @JoinColumn(name = "idZone", nullable = false)
    private Zone zone;

    public Complaint() {
    }

    public Complaint(int idComplaint, String NComplaint, PoliceStation policeStation, Zone zone) {
        this.idComplaint = idComplaint;
        this.NComplaint = NComplaint;
        this.policeStation = policeStation;
        this.zone = zone;
    }

    public PoliceStation getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(PoliceStation policeStation) {
        this.policeStation = policeStation;
    }

    public int getIdComplaint() {
        return idComplaint;
    }

    public void setIdComplaint(int idComplaint) {
        this.idComplaint = idComplaint;
    }

    public String getNComplaint() {
        return NComplaint;
    }

    public void setNComplaint(String NComplaint) {
        this.NComplaint = NComplaint;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }
}
