package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.SolicitudAcceso;

import java.util.List;

public interface ISolicitudAccesoSevice {
    public void insert(SolicitudAcceso solicitudAcceso);
    public List<SolicitudAcceso> list();
}
