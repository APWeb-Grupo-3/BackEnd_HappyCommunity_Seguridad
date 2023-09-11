package pe.edu.upc.aaw.backend_happycomunity.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "RolUsuario", uniqueConstraints = { @UniqueConstraint(columnNames = { "idUsuario", "nombreRol", "descripcion" })}) //@Table(name = "RolUsuario")
public class RolUsuario implements Serializable {  //public class RolUsuario {

    private static final long serialVersionUID = 1L; //

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private int idRolUsuario;
    private Long idRolUsuario;

    @Column(name = "nombreRol",length = 150,nullable = false)
    private String nombreRol;
    @Column(name = "descripcion",length = 400,nullable = true)
    private String descripcion;

    @ManyToOne //
    @JoinColumn(name="idUsuario", nullable = false)//
    private Usuario usuario;//

    public RolUsuario() {
    }

    public RolUsuario(Long idRolUsuario, String nombreRol, String descripcion, Usuario usuario) {
        this.idRolUsuario = idRolUsuario;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
        this.usuario = usuario;
    }

    public Long getIdRolUsuario() {
        return idRolUsuario;
    }

    public void setIdRolUsuario(Long idRolUsuario) {
        this.idRolUsuario = idRolUsuario;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
