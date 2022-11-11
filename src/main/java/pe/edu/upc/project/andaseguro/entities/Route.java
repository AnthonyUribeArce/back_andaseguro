package pe.edu.upc.project.andaseguro.entities;

import javax.persistence.*;

@Entity
@Table(name = "Route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRoute;

    @Column(name = "CPointInit", nullable = false)
    private long CPointInit;

    @Column(name = "CPointEnd", nullable = false)
    private long CPointEnd;

    public Route() {
    }

    public Route(int idRoute, long CPointInit, long CPointEnd) {
        this.idRoute = idRoute;
        this.CPointInit = CPointInit;
        this.CPointEnd = CPointEnd;
    }

    public int getIdRoute() {
        return idRoute;
    }

    public void setIdRoute(int idRoute) {
        this.idRoute = idRoute;
    }

    public long getCPointInit() {
        return CPointInit;
    }

    public void setCPointInit(long CPointInit) {
        this.CPointInit = CPointInit;
    }

    public long getCPointEnd() {
        return CPointEnd;
    }

    public void setCPointEnd(long CPointEnd) {
        this.CPointEnd = CPointEnd;
    }
}
