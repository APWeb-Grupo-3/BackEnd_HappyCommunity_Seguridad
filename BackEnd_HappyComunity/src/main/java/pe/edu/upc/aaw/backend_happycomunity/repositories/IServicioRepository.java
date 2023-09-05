package pe.edu.upc.aaw.backend_happycomunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.backend_happycomunity.entities.Servicio;

@Repository
public interface IServicioRepository extends JpaRepository<Servicio, Integer> {






}
