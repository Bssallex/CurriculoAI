package CurriculoAI.infrastructure.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "experiencias")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ExperienciasEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String objetivo;

    @ElementCollection
    private List<String> experiencia;

    @ElementCollection
    private List<String> habilidades;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private DadosUsuarioEntity usuario;
}
