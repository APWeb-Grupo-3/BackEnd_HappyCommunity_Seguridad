package pe.edu.upc.aaw.backend_happycomunity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend_happycomunity.entities.PlanConvivencia;
import pe.edu.upc.aaw.backend_happycomunity.repositories.IPlanConvivenciaRepository;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.IPlanConvivenciaService;

import java.util.List;

@Service
public class PlanConvivenciaServiceImplement implements IPlanConvivenciaService {
    @Autowired

    private IPlanConvivenciaRepository pR;
    @Override
    public void insert(PlanConvivencia planConvivencia){
        pR.save(planConvivencia);
    }
    @Override
    public List<PlanConvivencia> list(){
        return pR.findAll();
    }

    @Override
    public PlanConvivencia listarId(int IdPlanConvivencia) {
        return pR.findById(IdPlanConvivencia).orElse(new PlanConvivencia());
    }
}
