package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.TarjetaDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.Tarjeta;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ITarjetaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tarjeta")
public class TarjetaController {

    @Autowired
    private ITarjetaService tS;
    @PatchMapping
    public void registrar(@RequestBody TarjetaDTO dto){
        ModelMapper m = new ModelMapper();
        Tarjeta t = m.map(dto, Tarjeta.class);
        tS.insert(t);
    }

    @GetMapping
    public List<TarjetaDTO> listar(){
        return tS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TarjetaDTO.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public  void  eliminar(@PathVariable("id")Integer id){
        tS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody TarjetaDTO dto) {
        ModelMapper m = new ModelMapper();
        Tarjeta t = m.map(dto, Tarjeta.class);
        tS.insert(t);
    }
}
