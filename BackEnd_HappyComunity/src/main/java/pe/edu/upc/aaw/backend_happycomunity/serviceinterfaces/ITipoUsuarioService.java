package pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces;

import pe.edu.upc.aaw.backend_happycomunity.entities.TipoUsuario;

import java.util.List;

public interface ITipoUsuarioService {
    public void insert(TipoUsuario tipousuario);
    public List<TipoUsuario> list();
    public void delete(int idTipoUsuario);
}

