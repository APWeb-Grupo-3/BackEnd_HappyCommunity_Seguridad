package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.DocumentoPago;

import java.util.List;

public interface IDocumentoPagoService {
    public void insert(DocumentoPago documentoPago);
    public List<DocumentoPago>list();
    public void delete(int idDocumentoPago);
}
