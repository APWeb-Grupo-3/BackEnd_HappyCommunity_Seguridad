package pe.edu.upc.aaw.backend_happycomunity.dtos;

import pe.edu.upc.aaw.backend_happycomunity.entities.TipoServicio;

public class ServicioDTO {

private int idServicio;
private int descripcionServicio;

private TipoServicio tipoServicio;


    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(int descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
}
