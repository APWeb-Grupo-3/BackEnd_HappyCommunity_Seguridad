package pe.edu.upc.aaw.backend_happycomunity.dtos;

import pe.edu.upc.aaw.backend_happycomunity.entities.TipoDocPago;
import pe.edu.upc.aaw.backend_happycomunity.entities.Usuario;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class DocumentoPagoDTO {
    private int idDocumentoPago;
    private int remitente_id;
    private LocalDate fecha_emision;
    private LocalDate fecha_vencimiento;
    private String moneda;
    private double total;
    private String estado;
    private Usuario usuario;
    private TipoDocPago tipodocpago;

    public int getIdDocumentoPago() {
        return idDocumentoPago;
    }

    public void setIdDocumentoPago(int idDocumentoPago) {
        this.idDocumentoPago = idDocumentoPago;
    }

    public int getRemitente_id() {
        return remitente_id;
    }

    public void setRemitente_id(int remitente_id) {
        this.remitente_id = remitente_id;
    }

    public LocalDate getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(LocalDate fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoDocPago getTipodocpago() {
        return tipodocpago;
    }

    public void setTipodocpago(TipoDocPago tipodocpago) {
        this.tipodocpago = tipodocpago;
    }
}
