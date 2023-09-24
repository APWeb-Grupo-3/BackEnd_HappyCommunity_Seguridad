package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.Aviso;

import java.util.List;

public interface IAvisoService {

    public void insert(Aviso aviso);
    public List<Aviso> list();
    public void delete(int idAviso);
    public List<String[]> quantityAnnouncementPerMonth();
}
