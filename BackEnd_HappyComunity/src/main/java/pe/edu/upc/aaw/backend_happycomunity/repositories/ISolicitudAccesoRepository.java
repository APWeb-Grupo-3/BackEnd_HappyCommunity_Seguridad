package pe.edu.upc.aaw.backend_happycomunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.aaw.backend_happycomunity.entities.SolicitudAcceso;
import org.springframework.stereotype.Repository;

@Repository
public interface ISolicitudAccesoRepository extends JpaRepository<SolicitudAcceso, Integer> {
}
