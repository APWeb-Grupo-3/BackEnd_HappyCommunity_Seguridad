package pe.edu.upc.aaw.backend_happycomunity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend_happycomunity.entities.Servicio;
import pe.edu.upc.aaw.backend_happycomunity.repositories.IServicioRepository;
import pe.edu.upc.aaw.backend_happycomunity.repositories.ITipoServicioRepository;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.IServicioService;

import java.util.List;

@Service
public class ServicioServiceImplement implements IServicioService {


    @Autowired
    private IServicioRepository serR;




    @Override
    public void insert(Servicio servicio) {
        serR.save(servicio);
    }

    @Override
    public List<Servicio> list() {
        return serR.findAll();
    }

    @Override
    public void delete(int idTipoServicio) {
        serR.deleteById(idTipoServicio);
    }






}
