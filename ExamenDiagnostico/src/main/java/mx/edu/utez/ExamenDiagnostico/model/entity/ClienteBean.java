package mx.edu.utez.ExamenDiagnostico.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "clientes")
public class ClienteBean {

    @Id
    @Column(name = "id_cliente", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_cliente;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "curp", unique = true)
    private String curp;
    @Column(name = "fecha_nacimiento")
    private String fecha_nacimiento;

}
