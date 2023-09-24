package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.CondominioDTO;
import pe.edu.upc.aaw.backend_happycomunity.dtos.SolicitudAccesoDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.Condominio;
import pe.edu.upc.aaw.backend_happycomunity.entities.SolicitudAcceso;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ISolicitudAccesoSevice;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/solicitudacceso")
public class SolicitudAccesoController {
    @Autowired
    private ISolicitudAccesoSevice sS;
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('VECINO') ")

    @PostMapping
    public void registrar(@RequestBody SolicitudAccesoDTO dto){
        ModelMapper m= new ModelMapper();
        SolicitudAcceso s= m.map(dto, SolicitudAcceso.class);
        sS.insert(s);
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('VECINO') ")
    @GetMapping
    public List<SolicitudAccesoDTO> listar(){
        return  sS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,SolicitudAccesoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public  void  eliminar(@PathVariable("id")Integer id){
        sS.delete(id);
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('VECINO') ")
    @PutMapping
    public void modificar(@RequestBody SolicitudAccesoDTO dto) {
        ModelMapper m = new ModelMapper();
        SolicitudAcceso s = m.map(dto, SolicitudAcceso.class);
        sS.insert(s);
    }

    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('VECINO')")

    @GetMapping("/{id}")
    public SolicitudAccesoDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        SolicitudAccesoDTO dto=m.map(sS.listarId(id),SolicitudAccesoDTO.class);
        return dto;
    }

}
