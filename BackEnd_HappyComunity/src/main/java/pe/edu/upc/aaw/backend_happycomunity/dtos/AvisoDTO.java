package pe.edu.upc.aaw.backend_happycomunity.dtos;

import pe.edu.upc.aaw.backend_happycomunity.entities.Condominio;
import pe.edu.upc.aaw.backend_happycomunity.entities.Usuario;

import java.time.LocalDate;

public class AvisoDTO {

    private int idAviso;
    private String titulo;
    private String descripcion;
    private UsuarioDTO usuario;
    private Condominio condominio;
    private LocalDate fechaPublicacion;
    public int getIdAviso() {
        return idAviso;
    }

    public void setIdAviso(int idAviso) {
        this.idAviso = idAviso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public LocalDate getFechaPublicacion() { return fechaPublicacion;}

    public void setFechaPublicacion(LocalDate fechaPublicacion) { this.fechaPublicacion = fechaPublicacion;
    }
}

