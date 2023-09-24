package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import org.springframework.data.jpa.repository.Query;
import pe.edu.upc.aaw.backend_happycomunity.entities.DocumentoPago;
import pe.edu.upc.aaw.backend_happycomunity.entities.PlanConvivencia;

import java.util.List;

public interface IDocumentoPagoService {
    public void insert(DocumentoPago documentoPago);
    public List<DocumentoPago>list();
    public void delete(int idDocumentoPago);
    //HU44	Visualizar el mes con mayor deuda
    List<Object[]> MesMayorDeuda();
/*
    //HU45	Visualizar el monto total de deudas por cada mes
    List<Object[]> MesDeuda();

 */

    public DocumentoPago listarId(int IdDocumentoPago);

}
