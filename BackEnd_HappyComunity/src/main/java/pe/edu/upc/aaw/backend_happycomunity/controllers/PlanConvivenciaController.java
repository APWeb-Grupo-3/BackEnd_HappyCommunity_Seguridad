package pe.edu.upc.aaw.backend_happycomunity.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend_happycomunity.dtos.PlanConvivenciaDTO;
import pe.edu.upc.aaw.backend_happycomunity.entities.PlanConvivencia;
import pe.edu.upc.aaw.backend_happycomunity.serviceinterfaces.IPlanConvivenciaService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/PlanConvivencia")
public class PlanConvivenciaController {
    @Autowired
    private IPlanConvivenciaService pS;
    @PostMapping
    public void registrar(@RequestBody PlanConvivenciaDTO dto){
        ModelMapper m=new ModelMapper();
        PlanConvivencia u=m.map(dto,PlanConvivencia.class);
        pS.insert(u);
    }
    @GetMapping
    public List<PlanConvivenciaDTO> listar(){
        return pS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PlanConvivenciaDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void modificar(@RequestBody PlanConvivenciaDTO dto){
        ModelMapper m=new ModelMapper();
        PlanConvivencia u=m.map(dto,PlanConvivencia.class);
        pS.insert(u);
    }
}
