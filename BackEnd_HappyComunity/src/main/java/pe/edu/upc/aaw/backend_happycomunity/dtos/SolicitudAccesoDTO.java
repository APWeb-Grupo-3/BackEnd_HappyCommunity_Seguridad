package pe.edu.upc.aaw.backend_happycomunity.dtos;

import pe.edu.upc.aaw.backend_happycomunity.entities.Condominio;
import pe.edu.upc.aaw.backend_happycomunity.entities.Usuario;



public class SolicitudAccesoDTO {

    private int idSolicitudAcceso;
    private String estado;
    private Condominio condominio;
    private UsuarioDTO usuario;

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

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }
}
