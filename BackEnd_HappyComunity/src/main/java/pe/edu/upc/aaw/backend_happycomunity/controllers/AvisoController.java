package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.AvisoDTO;
import pe.edu.upc.aaw.backend_happycomunity.dtos.TarjetaDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.Aviso;
import pe.edu.upc.aaw.backend_happycomunity.entities.Tarjeta;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.IAvisoService;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ITarjetaService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/avisos")
public class AvisoController {

    @Autowired
    private IAvisoService aS;
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('VECINO') or hasAuthority('INVITADO')")
    @PostMapping
    public void registrar(@RequestBody AvisoDTO dto){
        ModelMapper m = new ModelMapper();
        Aviso d = m.map(dto, Aviso.class);
        aS.insert(d);
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('VECINO') or hasAuthority('INVITADO')")
    @GetMapping
    public List<AvisoDTO> listar(){
        return aS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,AvisoDTO.class);

        }).collect(Collectors.toList());
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('VECINO') or hasAuthority('INVITADO')")
    @DeleteMapping("/{id}")
    public  void  eliminar(@PathVariable("id")Integer id){
        aS.delete(id);
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR') or hasAuthority('VECINO') or hasAuthority('INVITADO')")
    @PutMapping
    public void modificar(@RequestBody AvisoDTO dto) {
        ModelMapper m = new ModelMapper();
        Aviso a = m.map(dto, Aviso.class);
        aS.insert(a);
    }

}
