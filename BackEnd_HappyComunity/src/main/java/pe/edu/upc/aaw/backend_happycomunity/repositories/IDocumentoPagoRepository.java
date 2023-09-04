package pe.edu.upc.aaw.backend_happycomunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.backend_happycomunity.entities.DocumentoPago;
@Repository
public interface IDocumentoPagoRepository extends JpaRepository<DocumentoPago,Integer> {
    //HU28: Visualizar pagos pendientes (vecino)
}
