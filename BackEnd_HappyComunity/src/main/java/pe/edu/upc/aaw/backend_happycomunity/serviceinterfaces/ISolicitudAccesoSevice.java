package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.Condominio;
import pe.edu.upc.aaw.backend_happycomunity.entities.SolicitudAcceso;

import java.util.List;

public interface ISolicitudAccesoSevice {
    public void insert(SolicitudAcceso solicitudAcceso);
    public List<SolicitudAcceso> list();
    public void delete(int idSolicitudAcceso);

    public SolicitudAcceso listarId(int IdSolicitudAcceso);
}
