package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PoliceStation")
public class PoliceStation implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPolicestation;

    @Column(name = "NPoliceStation", length = 45, nullable = false)
    private String npolicestation;

    @Column(name = "TCell", length = 10, nullable = false)
    private long TCell;

    @OneToOne
    @JoinColumn(name = "idDirection", nullable = false)
    private Direction direction;

    public PoliceStation() {
    }

    public PoliceStation(int idPolicestation, String npolicestation, long TCell, Direction direction) {
        this.idPolicestation = idPolicestation;
        this.npolicestation = npolicestation;
        this.TCell = TCell;
        this.direction = direction;
    }


    public int getIdPolicestation() {
        return idPolicestation;
    }

    public void setIdPolicestation(int idPolicestation) {
        this.idPolicestation = idPolicestation;
    }

    public String getNpolicestation() {
        return npolicestation;
    }

    public void setNpolicestation(String npolicestation) {
        this.npolicestation = npolicestation;
    }

    public long getTCell() {
        return TCell;
    }


    public void setTCell(long TCell) {
        this.TCell = TCell;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
