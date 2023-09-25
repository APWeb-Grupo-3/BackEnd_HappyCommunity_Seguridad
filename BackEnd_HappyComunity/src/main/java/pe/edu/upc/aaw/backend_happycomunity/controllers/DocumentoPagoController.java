package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.CondominioDTO;
import pe.edu.upc.aaw.backend_happycomunity.dtos.DocumentoPagoDTO;
import pe.edu.upc.aaw.backend_happycomunity.dtos.Reporte1DTO;
import pe.edu.upc.aaw.backend_happycomunity.dtos.UsuarioDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.DocumentoPago;
import pe.edu.upc.aaw.backend_happycomunity.entities.Usuario;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.IDocumentoPagoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/documentodepago")
public class DocumentoPagoController {
    @Autowired
    private IDocumentoPagoService dS;
    //HU26: Registrar documento de pago
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @PostMapping
    public void registrar(@RequestBody DocumentoPagoDTO dto){
        ModelMapper m=new ModelMapper();
        DocumentoPago d=m.map(dto,DocumentoPago.class);
        dS.insert(d);
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @GetMapping
    public List<DocumentoPagoDTO>listar(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DocumentoPagoDTO.class);
        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        dS.delete(id);
    }

    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('VECINO') or hasAuthority('INVITADO')")
    @PutMapping
    public void modificar(@RequestBody DocumentoPagoDTO dto){
        ModelMapper m=new ModelMapper();
        DocumentoPago d=m.map(dto,DocumentoPago.class);
        dS.insert(d);
    }

    //HU44	Visualizar el mes con mayor deuda
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @GetMapping("/MesMayorDeuda")
    public List<Object[]> MesMayorDeuda(){return dS.MesMayorDeuda();}

    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @GetMapping("/DeudaMes")
    public List<Object[]> DeudaMes(){return dS.DeudaMes();}
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('VECINO')")
    @GetMapping("/{id}")
    public DocumentoPagoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        DocumentoPagoDTO dto=m.map(dS.listarId(id),DocumentoPagoDTO.class);
        return dto;
    }
}
