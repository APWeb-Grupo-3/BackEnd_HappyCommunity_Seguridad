package pe.edu.upc.aaw.backend_happycomunity.dtos;

import pe.edu.upc.aaw.backend_happycomunity.entities.DocumentoPago;
import pe.edu.upc.aaw.backend_happycomunity.entities.Servicio;
import pe.edu.upc.aaw.backend_happycomunity.entities.TipoServicio;

import javax.persistence.*;

public class DetalleDTO {


    private int idDetalle;

    private String subtotalDetalle;

    private DocumentoPagoDTO documentoPago;

    private Servicio servicio;

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getSubtotalDetalle() {
        return subtotalDetalle;
    }

    public void setSubtotalDetalle(String subtotalDetalle) {
        this.subtotalDetalle = subtotalDetalle;
    }

    public DocumentoPagoDTO getDocumentoPago() {
        return documentoPago;
    }

    public void setDocumentoPago(DocumentoPagoDTO documentoPago) {
        this.documentoPago = documentoPago;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
}