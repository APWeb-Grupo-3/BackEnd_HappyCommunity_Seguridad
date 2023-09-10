package pe.edu.upc.aaw.backend_happycomunity.dtos;

import pe.edu.upc.aaw.backend_happycomunity.entities.Condominio;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PlanConvivenciaDTO {
    private int idPlanConvivencia;
    private String titulo;
    private String descripcion;
    private Condominio condominio;
    public int getIdPlanConvivencia() {
        return idPlanConvivencia;
    }

    public void setIdPlanConvivencia(int idPlanConvivencia) {
        this.idPlanConvivencia = idPlanConvivencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Condominio getCondominio() {
        return condominio;
    }

    public void setCondominio(Condominio condominio) {
        this.condominio = condominio;
    }


}
