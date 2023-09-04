package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.Tarjeta;

import java.util.List;

public interface ITarjetaService {

    public void insert(Tarjeta tarjeta);
    public List<Tarjeta>list();
    public void delete(int idTarjeta);

}
