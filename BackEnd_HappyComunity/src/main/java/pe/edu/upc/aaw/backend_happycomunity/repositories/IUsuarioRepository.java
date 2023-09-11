package pe.edu.upc.aaw.backend_happycomunity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.aaw.backend_happycomunity.entities.Usuario;

//@Service
@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Long> {
    //INSERTAR ROLES
    @Transactional//
    @Modifying//
    @Query(value = "insert into roles (nombreRol, idUsuario) VALUES (:nombreRol, :idUsuario)", nativeQuery = true)//
    public void insRol(@Param("nombreRol") String authority, @Param("idUsuario") Long user_id);//

}
