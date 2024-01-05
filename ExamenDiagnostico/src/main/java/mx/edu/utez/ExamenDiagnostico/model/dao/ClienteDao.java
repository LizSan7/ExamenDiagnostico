package mx.edu.utez.ExamenDiagnostico.model.dao;

import mx.edu.utez.ExamenDiagnostico.model.entity.ClienteBean;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<ClienteBean, Integer> {
}
