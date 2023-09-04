package pe.edu.upc.aaw.backend_happycomunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.backend_happycomunity.entities.PlanConvivencia;

@Repository
public interface IPlanConvivenciaRepository extends JpaRepository<PlanConvivencia, Integer> {

}
