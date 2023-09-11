package pe.edu.upc.aaw.backend_happycomunity.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable { //public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //private int idUsuario;
    private Long idUsuario;//
    @Column(name = "nombres",length = 300,nullable = false)
    private String nombres;
    @Column(name = "apellidos",length = 400,nullable = false)
    private String apellidos;
    @Column(name = "correo",length = 400,nullable = false)
    private String correo;
    @Column(name = "clave",length = 500,nullable = false)
    private String clave;
    @Column(name = "edad",nullable = false)
    private int edad;
    @Column(name = "telefono",nullable = false)
    private int telefono;
    @Column(name = "genero",nullable = false)
    private String genero;

    //private Boolean enabled; no esta en nuestra tabla
    /*
    @ManyToOne
    @JoinColumn(name = "idTipoUsuario")
    private RolUsuario tipoUsuario;
*/
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)//
    @JoinColumn(name = "idUsuario")//
    private List<RolUsuario> rolUsuarios;//

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombres, String apellidos, String correo, String clave, int edad, int telefono, String genero, List<RolUsuario> rolUsuarios) {
        this.idUsuario = idUsuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.clave = clave;
        this.edad = edad;
        this.telefono = telefono;
        this.genero = genero;
        this.rolUsuarios = rolUsuarios;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<RolUsuario> getRolUsuarios() {
        return rolUsuarios;
    }

    public void setRolUsuarios(List<RolUsuario> rolUsuarios) {
        this.rolUsuarios = rolUsuarios;
    }
}
