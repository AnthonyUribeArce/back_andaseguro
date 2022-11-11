package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;

    @Column(name = "NUserName", length = 45, nullable = false)
    private String NUserName;

    @Column(name = "NUserLastName", length = 45, nullable = false)
    private String NUserLastName;

    @Column(name = "NDni", length = 45, nullable = false)
    private String NDni;

    @Column(name = "TMail", length = 45, nullable = false)
    private String TMail;

    @Column(name = "NPassword", length = 45, nullable = false)
    private String NPassword;

    @ManyToOne
    @JoinColumn(name = "idDirection", nullable = false)
    private Direction direction;

    public User() {
    }

    public User(int idUser, String NUserName, String NUserLastName, String NDni, String TMail, String NPassword, Direction direction) {
        this.idUser = idUser;
        this.NUserName = NUserName;
        this.NUserLastName = NUserLastName;
        this.NDni = NDni;
        this.TMail = TMail;
        this.NPassword = NPassword;
        this.direction = direction;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNUserName() {
        return NUserName;
    }

    public void setNUserName(String NUserName) {
        this.NUserName = NUserName;
    }

    public String getNUserLastName() {
        return NUserLastName;
    }

    public void setNUserLastName(String NUserLastName) {
        this.NUserLastName = NUserLastName;
    }

    public String getNDni() {
        return NDni;
    }

    public void setNDni(String NDni) {
        this.NDni = NDni;
    }

    public String getTMail() {
        return TMail;
    }

    public void setTMail(String TMail) {
        this.TMail = TMail;
    }

    public String getNPassword() {
        return NPassword;
    }

    public void setNPassword(String NPassword) {
        this.NPassword = NPassword;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
