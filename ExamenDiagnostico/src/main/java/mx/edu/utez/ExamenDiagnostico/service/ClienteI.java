package mx.edu.utez.ExamenDiagnostico.service;

import mx.edu.utez.ExamenDiagnostico.model.dto.ClienteDto;
import mx.edu.utez.ExamenDiagnostico.model.entity.ClienteBean;

import java.util.List;

public interface ClienteI{

    ClienteBean save (ClienteDto clienteDto);
    void delete (ClienteBean clienteBean);
    ClienteBean findById(Integer id);
    List<ClienteBean> findAll();
}

