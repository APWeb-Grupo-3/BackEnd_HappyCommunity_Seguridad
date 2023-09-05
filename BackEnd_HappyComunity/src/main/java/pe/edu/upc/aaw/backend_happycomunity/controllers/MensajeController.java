package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.MensajeDTO;
import pe.edu.upc.aaw.backend_happycomunity.dtos.TarjetaDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.Mensaje;
import pe.edu.upc.aaw.backend_happycomunity.entities.Tarjeta;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.IMensajeService;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.ITarjetaService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/mensaje")
public class MensajeController {

    @Autowired
    private IMensajeService mS;
    @PostMapping
    public void registrar(@RequestBody MensajeDTO dto){
        ModelMapper m = new ModelMapper();
        Mensaje e = m.map(dto, Mensaje.class);
        mS.insert(e);
    }

    @GetMapping
    public List<MensajeDTO> listar(){
        return mS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,MensajeDTO.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public  void  eliminar(@PathVariable("id")Integer id){
        mS.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody MensajeDTO dto) {
        ModelMapper m = new ModelMapper();
        Mensaje e = m.map(dto, Mensaje.class);
        mS.insert(e);
    }








}
