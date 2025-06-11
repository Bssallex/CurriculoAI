package CurriculoAI.infrastructure.persistence;

import CurriculoAI.core.enums.FormacaoAcademica;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "dados_usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DadosUsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String endereco;

    private String telefone;

    @ElementCollection
    private List<String> cursos;

    @ElementCollection
    private List<String> idiomas;

    @Enumerated(EnumType.STRING)
    private FormacaoAcademica formacao;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ExperienciasEntity> experiencias;
}
