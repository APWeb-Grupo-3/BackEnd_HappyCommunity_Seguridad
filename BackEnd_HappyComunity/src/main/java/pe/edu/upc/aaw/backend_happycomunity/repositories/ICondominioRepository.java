package pe.edu.upc.aaw.backend_happycomunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.backend_happycomunity.entities.Condominio;

@Repository
public interface ICondominioRepository extends JpaRepository<Condominio, Integer> {
}
