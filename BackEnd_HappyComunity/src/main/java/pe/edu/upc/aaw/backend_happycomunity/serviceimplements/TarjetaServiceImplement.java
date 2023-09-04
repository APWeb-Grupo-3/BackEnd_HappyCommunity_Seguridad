package pe.edu.upc.aaw.backend_happycomunity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend_happycomunity.entities.Tarjeta;
import pe.edu.upc.aaw.backend_happycomunity.repositories.ICondominioRepository;
import pe.edu.upc.aaw.backend_happycomunity.repositories.ITarjetaRepository;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ITarjetaService;

import java.util.List;
@Service
public class TarjetaServiceImplement implements ITarjetaService {

    @Autowired
    private ITarjetaRepository tR;
    @Override
    public void insert(Tarjeta tarjeta) {
        tR.save(tarjeta);
    }

    @Override
    public List<Tarjeta> list() {

        return tR.findAll();
    }

    @Override
    public void delete(int idTarjeta) {
        tR.deleteById(idTarjeta);
    }
}
