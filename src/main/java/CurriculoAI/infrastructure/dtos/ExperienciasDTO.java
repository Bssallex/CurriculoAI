package CurriculoAI.infrastructure.dtos;

import java.util.List;

public record ExperienciasDTO(Long id,
                              String objetivo,
                              List<String> experiencia,
                              List<String> habilidades) {
}
