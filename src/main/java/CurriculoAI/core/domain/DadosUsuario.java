package CurriculoAI.core.domain;

import CurriculoAI.core.enums.FormacaoAcademica;

import java.util.List;

public record DadosUsuario(Long id,
                           String nome,
                           String email,
                           String endereco,
                           int telefone,
                           List<String> cursos,
                           List<String> idiomas,
                           FormacaoAcademica formacao
                           ) {
}
