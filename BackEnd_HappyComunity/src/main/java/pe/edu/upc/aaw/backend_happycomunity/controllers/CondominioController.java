package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.CondominioDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.Condominio;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ICondominioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/condominios")
public class CondominioController {

    @Autowired
    private ICondominioService dS;
    @PostMapping
    public void registrar(@RequestBody CondominioDTO dto){
        ModelMapper m = new ModelMapper();
        Condominio d = m.map(dto, Condominio.class);
        dS.insert(d);
    }
    @GetMapping
    public List<CondominioDTO> listar(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CondominioDTO.class);

        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public  void  eliminar(@PathVariable("id")Integer id){
        dS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody CondominioDTO dto) {
        ModelMapper m = new ModelMapper();
        Condominio d = m.map(dto, Condominio.class);
        dS.insert(d);
    }
}
