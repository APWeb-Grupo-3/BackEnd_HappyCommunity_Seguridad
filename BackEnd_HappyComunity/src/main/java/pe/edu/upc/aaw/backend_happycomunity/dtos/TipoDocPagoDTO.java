package pe.edu.upc.aaw.backend_happycomunity.dtos;

import javax.persistence.Column;

public class TipoDocPagoDTO {
    private int idTipoDocPago;
    private String nombre;

    public int getIdTipoDocPago() {
        return idTipoDocPago;
    }

    public void setIdTipoDocPago(int idTipoDocPago) {
        this.idTipoDocPago = idTipoDocPago;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
