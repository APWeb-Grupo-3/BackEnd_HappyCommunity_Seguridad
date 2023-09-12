package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.TipoUsuarioDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.TipoUsuario;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ITipoUsuarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipousuarios")
public class TipoUsuarioController {
    @Autowired
    private ITipoUsuarioService ruS;

    @PostMapping
    public void registrar(@RequestBody TipoUsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        TipoUsuario tu=m.map(dto, TipoUsuario.class);
        ruS.insert(tu);
    }
    @GetMapping
    public List<TipoUsuarioDTO>listar(){
        return ruS.list().stream().map(x->{
                ModelMapper m=new ModelMapper();
                return m.map(x, TipoUsuarioDTO.class);
            }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        ruS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody TipoUsuarioDTO dto){
        ModelMapper m=new ModelMapper();
        TipoUsuario tu=m.map(dto, TipoUsuario.class);
        ruS.insert(tu);
    }
}
