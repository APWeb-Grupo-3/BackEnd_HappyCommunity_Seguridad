package pe.edu.upc.aaw.backend_happycomunity.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "DocumentoPago")
public class DocumentoPago {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDocumentoPago;
    @Column(name = "remitente_id",nullable = false)
    private int remitente_id;
    @Column(name = "fecha_emision",nullable = false)
    private LocalDate fecha_emision;
    @Column(name = "fecha_vencimeinto",nullable = false)
    private LocalDate fecha_vencimiento;
    @Column(name = "moneda",length = 100,nullable = false)
    private String moneda;
    //total int->double
    @Column(name = "total",nullable = false)
    private double total;
    @Column(name = "estado",length = 150,nullable = false)
    private String estado;
    //Foreign keys
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @ManyToOne
    @JoinColumn(name = "idTipoDocPago")
    private TipoDocPago tipodocpago;

    public DocumentoPago() {
    }

    public DocumentoPago(int idDocumentoPago, int remitente_id, LocalDate fecha_emision, LocalDate fecha_vencimiento, String moneda, double total, String estado, Usuario usuario, TipoDocPago tipodocpago) {
        this.idDocumentoPago = idDocumentoPago;
        this.remitente_id = remitente_id;
        this.fecha_emision = fecha_emision;
        this.fecha_vencimiento = fecha_vencimiento;
        this.moneda = moneda;
        this.total = total;
        this.estado = estado;
        this.usuario = usuario;
        this.tipodocpago = tipodocpago;
    }

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
