package pe.edu.upc.aaw.backend_happycomunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.backend_happycomunity.entities.DocumentoPago;

import java.util.List;

@Repository
public interface IDocumentoPagoRepository extends JpaRepository<DocumentoPago,Integer> {



    //HU28: Visualizar pagos pendientes (vecino)

}
