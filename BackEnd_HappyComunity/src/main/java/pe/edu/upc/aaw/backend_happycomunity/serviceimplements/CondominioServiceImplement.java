package pe.edu.upc.aaw.backend_happycomunity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend_happycomunity.entities.Condominio;
import pe.edu.upc.aaw.backend_happycomunity.repositories.ICondominioRepository;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ICondominioService;

import java.util.List;

@Service
public class CondominioServiceImplement implements ICondominioService {
    @Autowired
    private ICondominioRepository  dR;

    @Override
    public void insert(Condominio condominio) {
        dR.save(condominio);
    }

    @Override
    public List<Condominio> list() {
        return     dR.findAll();
    }

    @Override
    public void delete(int idCondominio) {
        dR.deleteById(idCondominio);
    }
}
