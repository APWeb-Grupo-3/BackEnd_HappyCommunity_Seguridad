package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.TipoServicioDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.TipoServicio;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ITipoServicioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tiposervicio")
public class TipoServicioController {

    @Autowired
    private ITipoServicioService tsS;
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @PostMapping
    public void registrar(@RequestBody TipoServicioDTO dto){
        ModelMapper m=new ModelMapper();
        TipoServicio t=m.map(dto,TipoServicio.class);
        tsS.insert(t);
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @GetMapping
    public List<TipoServicioDTO> listar(){
        return tsS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TipoServicioDTO.class);
        }).collect(Collectors.toList());
    }

    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        tsS.delete(id);
    }
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @PutMapping
    public void modificar(@RequestBody TipoServicioDTO dto){
        ModelMapper m=new ModelMapper();
        TipoServicio t=m.map(dto,TipoServicio.class);
        tsS.insert(t);
    }















}
