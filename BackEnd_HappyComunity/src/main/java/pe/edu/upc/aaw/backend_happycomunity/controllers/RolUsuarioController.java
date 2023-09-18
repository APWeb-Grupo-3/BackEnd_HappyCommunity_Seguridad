package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.RolUsuarioDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.RolUsuario;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.IRolUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rolusuarios")
public class RolUsuarioController {
    @Autowired
    private IRolUsuarioService ruS;

    @PostMapping
    public void registrar(@RequestBody RolUsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        RolUsuario tu=m.map(dto, RolUsuario.class);
        ruS.insert(tu);
    }
    @GetMapping
    public List<RolUsuarioDTO>listar(){
        return ruS.list().stream().map(x->{
                ModelMapper m=new ModelMapper();
                return m.map(x, RolUsuarioDTO.class);
            }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        ruS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody RolUsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        RolUsuario tu=m.map(dto, RolUsuario.class);
        ruS.insert(tu);
    }
}
