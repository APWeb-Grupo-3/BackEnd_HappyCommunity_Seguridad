package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.Detalle;
import pe.edu.upc.aaw.backend_happycomunity.entities.TipoServicio;

import java.util.List;

public interface IDetalleService {



    void insert(Detalle detalle);
    List<Detalle> list();
    void delete(int idDetalle);





}
