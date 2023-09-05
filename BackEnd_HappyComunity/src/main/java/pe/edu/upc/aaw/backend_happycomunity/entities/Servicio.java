package pe.edu.upc.aaw.backend_happycomunity.entities;

import javax.persistence.*;

@Entity
@Table(name= "Servicio")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicio;

    @Column(name="descripcionServicio", nullable = false)
    private String descripcionServicio;


    @ManyToOne
    @JoinColumn(name ="idTipoServicio")
    private Condominio idtiposervicio;



    public Servicio() {
    }

    public Servicio(int idServicio, String descripcionServicio, Condominio idtiposervicio) {
        this.idServicio = idServicio;
        this.descripcionServicio = descripcionServicio;
        this.idtiposervicio = idtiposervicio;
    }


    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public String getDescripcionServicio() {
        return descripcionServicio;
    }

    public void setDescripcionServicio(String descripcionServicio) {
        this.descripcionServicio = descripcionServicio;
    }

    public Condominio getIdtiposervicio() {
        return idtiposervicio;
    }

    public void setIdtiposervicio(Condominio idtiposervicio) {
        this.idtiposervicio = idtiposervicio;
    }
}
