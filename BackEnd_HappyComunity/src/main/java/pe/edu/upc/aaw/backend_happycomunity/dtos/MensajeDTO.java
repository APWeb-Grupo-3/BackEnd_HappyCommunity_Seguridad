package pe.edu.upc.aaw.backend_happycomunity.dtos;

import pe.edu.upc.aaw.backend_happycomunity.entities.Usuario;


public class MensajeDTO {


    private int idMensaje;
    private String titulo;
    private String descripcion;
    private Usuario usuario;

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
