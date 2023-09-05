package pe.edu.upc.aaw.backend_happycomunity.entities;

import javax.persistence.*;

@Entity
@Table(name= "Detalle")
public class Detalle {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalle;

    @Column(name="subtotalDetalle", nullable = false)
    private String subtotaldetalle;

    @ManyToOne
    @JoinColumn(name ="idDocumentoPago")
    private Condominio iddocumentopago;



    @ManyToOne
    @JoinColumn(name ="idServicio")
    private Condominio idservicio;


    public Detalle() {
    }

    public Detalle(int idDetalle, String subtotaldetalle, Condominio iddocumentopago, Condominio idservicio) {
        this.idDetalle = idDetalle;
        this.subtotaldetalle = subtotaldetalle;
        this.iddocumentopago = iddocumentopago;
        this.idservicio = idservicio;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getSubtotaldetalle() {
        return subtotaldetalle;
    }

    public void setSubtotaldetalle(String subtotaldetalle) {
        this.subtotaldetalle = subtotaldetalle;
    }

    public Condominio getIddocumentopago() {
        return iddocumentopago;
    }

    public void setIddocumentopago(Condominio iddocumentopago) {
        this.iddocumentopago = iddocumentopago;
    }

    public Condominio getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(Condominio idservicio) {
        this.idservicio = idservicio;
    }
}


