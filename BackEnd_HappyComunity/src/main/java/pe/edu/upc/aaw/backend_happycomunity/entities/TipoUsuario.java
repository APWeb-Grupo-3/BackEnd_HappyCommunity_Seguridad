package pe.edu.upc.aaw.backend_happycomunity.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TipoUsuario")
public class TipoUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoUsuario;

    @Column(name = "nombreTipo",length = 150,nullable = false)
    private String nombreTipo;
    @Column(name = "descripcion",length = 400,nullable = true)
    private String descripcion;

    public TipoUsuario() {
    }

    public TipoUsuario(int idTipoUsuario, String nombreTipo, String descripcion) {
        this.idTipoUsuario = idTipoUsuario;
        this.nombreTipo = nombreTipo;
        this.descripcion = descripcion;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
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
