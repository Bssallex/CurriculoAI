package CurriculoAI.core.domain;

import java.util.List;

public record Experiencias(Long id,
                           String objetivo,
                           List<String> experiencia,
                           List<String> habilidades
                           ) {
}
