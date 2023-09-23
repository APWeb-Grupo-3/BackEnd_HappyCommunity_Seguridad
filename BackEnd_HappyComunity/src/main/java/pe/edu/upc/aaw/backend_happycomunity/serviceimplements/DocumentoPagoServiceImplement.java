package pe.edu.upc.aaw.backend_happycomunity.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend_happycomunity.entities.DocumentoPago;
import pe.edu.upc.aaw.backend_happycomunity.repositories.IDocumentoPagoRepository;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.IDocumentoPagoService;

import java.util.List;

@Service
public class DocumentoPagoServiceImplement implements IDocumentoPagoService {
   @Autowired
    private IDocumentoPagoRepository dR;
    //HU26: Registrar documento de pago
    @Override
    public void insert(DocumentoPago documentoPago) {
        dR.save(documentoPago);
    }

    @Override
    public List<DocumentoPago> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idDocumentoPago) {
        dR.deleteById(idDocumentoPago);
    }


    //HU28: Visualizar pagos pendientes (vecino)
}
