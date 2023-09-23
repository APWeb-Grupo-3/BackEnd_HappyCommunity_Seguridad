package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.ServicioDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.Servicio;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.IServicioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/servicios")
public class ServicioController {



    @Autowired
    private IServicioService serR;
    @PostMapping
    public void registrar(@RequestBody ServicioDTO dto){
        ModelMapper m=new ModelMapper();
        Servicio t=m.map(dto,Servicio.class);
        serR.insert(t);
    }
    @GetMapping
    public List<ServicioDTO> listar(){
        return serR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ServicioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        serR.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody ServicioDTO dto) {
        ModelMapper m = new ModelMapper();
        Servicio t = m.map(dto, Servicio.class);
        serR.insert(t);
    }







}
