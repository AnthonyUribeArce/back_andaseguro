package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;

@Entity
@Table(name = "Driver")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDrive;

    @Column(name = "NLicense",length = 45, nullable = false)
    private String NLicense;

    @OneToOne
    @JoinColumn(name = "idUser", nullable = false)
    private User user;

    public Driver() {
    }

    public Driver(int idDrive, String NLicense, User user) {
        this.idDrive = idDrive;
        this.NLicense = NLicense;
        this.user = user;
    }

    public int getIdDrive() {
        return idDrive;
    }

    public void setIdDrive(int idDrive) {
        this.idDrive = idDrive;
    }

    public String getNLicense() {
        return NLicense;
    }

    public void setNLicense(String NLicense) {
        this.NLicense = NLicense;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
