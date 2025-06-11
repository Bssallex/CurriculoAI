package CurriculoAI.infrastructure.mapper;

import CurriculoAI.core.domain.Experiencias;
import CurriculoAI.infrastructure.persistence.ExperienciasEntity;
import org.springframework.stereotype.Component;

@Component
public class ExperienciasMapper {

    public ExperienciasEntity toEntity(Experiencias ex){
        return new ExperienciasEntity(
                ex.id(),
                ex.objetivo(),
                ex.experiencia(),
                ex.habilidades(),
                null);
    }

    public Experiencias toDomain(ExperienciasEntity entity){
        return new Experiencias(
                entity.getId(),
                entity.getObjetivo(),
                entity.getExperiencia(),
                entity.getHabilidades());
    }
}
