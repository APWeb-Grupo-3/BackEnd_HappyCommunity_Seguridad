package pe.edu.upc.aaw.backend_happycomunity.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Tarjeta")
public class Tarjeta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarjeta;

    @Column(name = "tipoTarjeta", length = 50, nullable = false)
    private String tipoTarjeta;
    @Column(name = "numeroTarjeta", nullable = false)
    private int numeroTarjeta;
    @Column(name = "fechaVencimiento",nullable = false)
    private LocalDate fechaVencimiento;
    @Column(name = "codigoSeguridad", nullable = false)
    private int codigoSeguridad;

    @ManyToOne
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    public Tarjeta() {
    }

    public Tarjeta(int idTarjeta, String tipoTarjeta, int numeroTarjeta, LocalDate fechaVencimiento, int codigoSeguridad, Usuario usuario) {
        idTarjeta = idTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoSeguridad = codigoSeguridad;
        this.usuario = usuario;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        idTarjeta = idTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
