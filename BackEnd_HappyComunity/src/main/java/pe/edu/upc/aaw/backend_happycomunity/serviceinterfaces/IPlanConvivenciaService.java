package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.PlanConvivencia;

import java.util.List;

public interface IPlanConvivenciaService {
    public void insert(PlanConvivencia planConvivencia);
    public List<PlanConvivencia> list();
}
