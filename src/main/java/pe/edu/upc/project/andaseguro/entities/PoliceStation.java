package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PoliceStation")
public class PoliceStation implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPoliceStation;

    @Column(name = "NPoliceStation", length = 45, nullable = false)
    private String NPoliceStation;

    @Column(name = "TCell", length = 10, nullable = false)
    private long TCell;

    @OneToOne
    @JoinColumn(name = "idDirection", nullable = false)
    private Direction direction;

    public PoliceStation() {
    }

    public PoliceStation(int idPoliceStation, String NPoliceStation, long TCell, Direction direction) {
        this.idPoliceStation = idPoliceStation;
        this.NPoliceStation = NPoliceStation;
        this.TCell = TCell;
        this.direction = direction;
    }

    public int getIdPoliceStation() {
        return idPoliceStation;
    }

    public String getNPoliceStation() {
        return NPoliceStation;
    }

    public long getTCell() {
        return TCell;
    }

    public void setIdPoliceStation(int idPoliceStation) {
        this.idPoliceStation = idPoliceStation;
    }

    public void setNPoliceStation(String NPoliceStation) {
        this.NPoliceStation = NPoliceStation;
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
