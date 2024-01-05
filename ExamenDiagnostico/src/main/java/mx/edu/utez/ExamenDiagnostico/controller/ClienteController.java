package mx.edu.utez.ExamenDiagnostico.controller;

import mx.edu.utez.ExamenDiagnostico.model.dto.ClienteDto;
import mx.edu.utez.ExamenDiagnostico.model.entity.ClienteBean;
import mx.edu.utez.ExamenDiagnostico.service.ClienteI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/clientes")
public class ClienteController {

    @Autowired
    private ClienteI clienteService;

    @GetMapping("/")
    public List<ClienteBean> getCliente(){
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public ClienteBean showById(@PathVariable Integer id){
        return clienteService.findById(id);
    }

    @PostMapping("/")
    public ClienteDto create(@RequestBody ClienteDto clienteDto){
        ClienteBean clienteSave = clienteService.save(clienteDto);
        return ClienteDto.builder()
                .id_cliente(clienteSave.getId_cliente())
                .nombre(clienteSave.getNombre())
                .apellidos(clienteSave.getApellidos())
                .curp(clienteSave.getCurp())
                .fecha_nacimiento(clienteSave.getFecha_nacimiento())
                .build();
    }

    @PutMapping("/{id}")
    public ClienteDto update(@RequestBody ClienteDto clienteDto){
        ClienteBean clienteUpdate = clienteService.save(clienteDto);
        return ClienteDto.builder()
                .id_cliente(clienteUpdate.getId_cliente())
                .nombre(clienteUpdate.getNombre())
                .apellidos(clienteUpdate.getApellidos())
                .curp(clienteUpdate.getCurp())
                .fecha_nacimiento(clienteUpdate.getFecha_nacimiento())
                .build();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        ClienteBean cliente =clienteService.findById(id);
        clienteService.delete(cliente);
    }
}
