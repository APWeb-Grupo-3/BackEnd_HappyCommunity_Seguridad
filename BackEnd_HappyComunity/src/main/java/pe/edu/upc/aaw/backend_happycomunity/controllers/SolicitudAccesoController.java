package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.CondominioDTO;
import pe.edu.upc.aaw.backend_happycomunity.dtos.SolicitudAccesoDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.Condominio;
import pe.edu.upc.aaw.backend_happycomunity.entities.SolicitudAcceso;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ISolicitudAccesoSevice;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/SolicitudAcceso")
public class SolicitudAccesoController {
    @Autowired
    private ISolicitudAccesoSevice sS;
    @PostMapping
    public void registrar(@RequestBody SolicitudAccesoDTO dto){
        ModelMapper m= new ModelMapper();
        SolicitudAcceso s= m.map(dto, SolicitudAcceso.class);
        sS.insert(s);
    }
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
    @PutMapping
    public void modificar(@RequestBody SolicitudAccesoDTO dto) {
        ModelMapper m = new ModelMapper();
        SolicitudAcceso s = m.map(dto, SolicitudAcceso.class);
        sS.insert(s);
    }

}
