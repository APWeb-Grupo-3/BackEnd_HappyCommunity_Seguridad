package pe.edu.upc.aaw.backend_happycomunity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend_happycomunity.entities.TipoUsuario;
import pe.edu.upc.aaw.backend_happycomunity.repositories.ITipoUsuarioRepository;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ITipoUsuarioService;

import java.util.List;

@Service
public class TipoUsuarioServiceImplement implements ITipoUsuarioService {
    @Autowired
    private ITipoUsuarioRepository tuR;
    @Override
    public void insert(TipoUsuario tipousuario){
        tuR.save(tipousuario);
    }
    @Override
    public List<TipoUsuario> list(){
        return tuR.findAll();
    }

    @Override
    public void delete(int idTipoUsuario) {
        tuR.deleteById(idTipoUsuario);
    }
}