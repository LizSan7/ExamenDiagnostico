package mx.edu.utez.ExamenDiagnostico.service.impl;

import mx.edu.utez.ExamenDiagnostico.model.dao.ClienteDao;
import mx.edu.utez.ExamenDiagnostico.model.dto.ClienteDto;
import mx.edu.utez.ExamenDiagnostico.model.entity.ClienteBean;
import mx.edu.utez.ExamenDiagnostico.service.ClienteI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteImpl implements ClienteI {
    @Autowired
    ClienteDao clienteDao;

    @Override
    public ClienteBean save(ClienteDto clienteDto) {
        ClienteBean clienteBean = ClienteBean.builder()
                .id_cliente(clienteDto.getId_cliente())
                .nombre(clienteDto.getNombre())
                .apellidos(clienteDto.getApellidos())
                .curp(clienteDto.getCurp())
                .fecha_nacimiento(clienteDto.getFecha_nacimiento())
                .build();
        return clienteDao.save(clienteBean);
    }

    @Override
    public void delete(ClienteBean clienteBean) {
        clienteDao.delete(clienteBean);
    }

    @Override
    public ClienteBean findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }

    @Override
    public List<ClienteBean> findAll() {
        return (List<ClienteBean>) clienteDao.findAll();
    }
}
