package CurriculoAI.core.domain;

import CurriculoAI.core.enums.FormacaoAcademica;

import java.util.List;

public record DadosUsuario(Long id,
                           String nome,
                           String email,
                           String endereco,
                           String telefone,
                           List<String> cursos,
                           List<String> idiomas,
                           List<Experiencias> experiencias,
                           FormacaoAcademica formacao
                           ) {
}
