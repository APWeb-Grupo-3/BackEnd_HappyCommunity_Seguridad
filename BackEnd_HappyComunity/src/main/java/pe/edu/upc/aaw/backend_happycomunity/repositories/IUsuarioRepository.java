package pe.edu.upc.aaw.backend_happycomunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend_happycomunity.entities.Usuario;

@Service
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {

}
