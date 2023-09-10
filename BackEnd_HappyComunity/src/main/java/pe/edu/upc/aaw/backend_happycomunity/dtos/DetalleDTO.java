package pe.edu.upc.aaw.backend_happycomunity.dtos;

import pe.edu.upc.aaw.backend_happycomunity.entities.DocumentoPago;
import pe.edu.upc.aaw.backend_happycomunity.entities.Servicio;
import pe.edu.upc.aaw.backend_happycomunity.entities.TipoServicio;

public class DetalleDTO {



    private int idDetalle;
    private int subtotalDetalle;

    private DocumentoPago documentoPago;

    private Servicio servicio;

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getSubtotalDetalle() {
        return subtotalDetalle;
    }

    public void setSubtotalDetalle(int subtotalDetalle) {
        this.subtotalDetalle = subtotalDetalle;
    }

    public DocumentoPago getDocumentoPago() {
        return documentoPago;
    }

    public void setDocumentoPago(DocumentoPago documentoPago) {
        this.documentoPago = documentoPago;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}
