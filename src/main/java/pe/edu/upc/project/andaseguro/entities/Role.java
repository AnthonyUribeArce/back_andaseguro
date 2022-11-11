package pe.edu.upc.project.andaseguro.entities;

public class Role {
    private int idRole;
    private String NRole;

    public Role() {
    }

    public Role(int idRole, String NRole) {
        this.idRole = idRole;
        this.NRole = NRole;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getNRole() {
        return NRole;
    }

    public void setNRole(String NRole) {
        this.NRole = NRole;
    }
}
