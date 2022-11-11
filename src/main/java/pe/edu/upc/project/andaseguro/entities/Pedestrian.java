package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Pedestrian")
public class Pedestrian implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedestrian;

    @OneToOne
    @JoinColumn(name = "idUser", nullable = false)
    private User user;

    public Pedestrian() {
    }

    public Pedestrian(int idPedestrian, User user) {
        this.idPedestrian = idPedestrian;
        this.user = user;
    }

    public int getIdPedestrian() {
        return idPedestrian;
    }

    public void setIdPedestrian(int idPedestrian) {
        this.idPedestrian = idPedestrian;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
