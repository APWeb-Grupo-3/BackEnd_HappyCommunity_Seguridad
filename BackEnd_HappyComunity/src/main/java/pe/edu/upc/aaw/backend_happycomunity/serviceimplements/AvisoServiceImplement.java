package pe.edu.upc.aaw.backend_happycomunity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend_happycomunity.entities.Aviso;
import pe.edu.upc.aaw.backend_happycomunity.repositories.IAvisoRepository;
import pe.edu.upc.aaw.backend_happycomunity.repositories.ITarjetaRepository;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.IAvisoService;

import java.util.List;
@Service
public class AvisoServiceImplement implements IAvisoService {

    @Autowired
    private IAvisoRepository aR;

    @Override
    public void insert(Aviso aviso) {
        aR.save(aviso);
    }

    @Override
    public List<Aviso> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idAviso) {
        aR.deleteById(idAviso);
    }
}
