package pe.edu.upc.aaw.backend_happycomunity.entities;

import javax.persistence.*;

@Entity
@Table(name = "RolUsuario")
public class RolUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRolUsuario;

    @Column(name = "nombreTipo",length = 150,nullable = false)
    private String nombreTipo;
    @Column(name = "descripcion",length = 400,nullable = true)
    private String descripcion;

    public RolUsuario() {
    }

    public RolUsuario(int idRolUsuario, String nombreTipo, String descripcion) {
        this.idRolUsuario = idRolUsuario;
        this.nombreTipo = nombreTipo;
        this.descripcion = descripcion;
    }

    public int getIdRolUsuario() {
        return idRolUsuario;
    }

    public void setIdRolUsuario(int idRolUsuario) {
        this.idRolUsuario = idRolUsuario;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
