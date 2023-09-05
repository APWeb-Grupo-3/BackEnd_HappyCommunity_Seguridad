package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.TipoServicio;


import java.util.List;

public interface ITipoServicioService {



    void insert(TipoServicio tipoServicio );
    List<TipoServicio> list();
    void delete(int idTipoServicio);




}
