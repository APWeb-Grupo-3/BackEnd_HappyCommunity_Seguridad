package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.Detalle;
import pe.edu.upc.aaw.backend_happycomunity.entities.Servicio;

import java.util.List;

public interface IServicioService {


    void insert(Servicio servicio);
    List<Servicio> list();
    void delete(int idServicio);

}
