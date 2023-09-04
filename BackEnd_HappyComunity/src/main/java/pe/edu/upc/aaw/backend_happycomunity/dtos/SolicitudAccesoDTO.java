package pe.edu.upc.aaw.backend_happycomunity.dtos;

import pe.edu.upc.aaw.backend_happycomunity.entities.Condominio;
import pe.edu.upc.aaw.backend_happycomunity.entities.Usuario;



public class SolicitudAccesoDTO {

    private int idSolicitudAcceso;
    private String estado;
    private Condominio condominio;
    private Usuario usuario;

    public int getIdSolicitudAcceso() {
        return idSolicitudAcceso;
    }

    public void setIdSolicitudAcceso(int idSolicitudAcceso) {
        this.idSolicitudAcceso = idSolicitudAcceso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
