package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.TipoDocPago;

import java.util.List;

public interface ITipoDocPagoService {
    public void insert(TipoDocPago tipoDocPago);
    public List<TipoDocPago>list();
    public void delete(int idTipoDocPago);
}
