package CurriculoAI.infrastructure.mapper;

import CurriculoAI.core.domain.DadosUsuario;
import CurriculoAI.core.domain.Experiencias;
import CurriculoAI.infrastructure.persistence.DadosUsuarioEntity;
import CurriculoAI.infrastructure.persistence.ExperienciasEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class DadosUsuarioMapper {

    private final ExperienciasMapper experiencia;

    public DadosUsuarioEntity toEntity(DadosUsuario dados){

        List<ExperienciasEntity> experienciaEntity = dados.experiencias().stream()
                .map(experiencia::toEntity)
                .peek(e -> e.setUsuario(null))
                .toList();

        return new DadosUsuarioEntity(
                dados.id(),
                dados.nome(),
                dados.email(),
                dados.endereco(),
                dados.telefone(),
                dados.cursos(),
                dados.idiomas(),
                dados.formacao(),
                experienciaEntity
                );
    }

    public DadosUsuario toDomain(DadosUsuarioEntity entity){

        List<Experiencias> experienciaDomain = entity.getExperiencias().stream()
                .map(experiencia::toDomain)
                .toList();

        return new DadosUsuario(
                entity.getId(),
                entity.getNome(),
                entity.getEmail(),
                entity.getEndereco(),
                entity.getTelefone(),
                entity.getCursos(),
                entity.getIdiomas(),
                experienciaDomain,
                entity.getFormacao());
    }

}
