package pe.edu.upc.aaw.backend_happycomunity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend_happycomunity.entities.SolicitudAcceso;
import pe.edu.upc.aaw.backend_happycomunity.repositories.ISolicitudAccesoRepository;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ISolicitudAccesoSevice;


import java.util.List;

@Service
public class SolicitudAccesoServiceImplement implements ISolicitudAccesoSevice {
    @Autowired

    private ISolicitudAccesoRepository sR;
    @Override
    public void insert(SolicitudAcceso solicitudAcceso){
        sR.save(solicitudAcceso);
    }
    @Override
    public List<SolicitudAcceso> list(){
        return sR.findAll();
    }
}
