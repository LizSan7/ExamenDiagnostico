package mx.edu.utez.ExamenDiagnostico.model.dto;

import jakarta.persistence.Column;
import lombok.*;

@Builder
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ClienteDto {

    private Integer id_cliente;
    private String nombre;
    private String apellidos;
    private String curp;
    private String fecha_nacimiento;
}
