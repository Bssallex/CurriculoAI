package CurriculoAI.core.enums;

public enum FormacaoAcademica {

    FUNDAMENTAL_COMPLETO("Ensino Fundamental Completo"),
    FUNDAMENTAL_INCOMPLETO("Ensino Fundamental Incompleto"),
    MEDIO_COMPLETO("Ensino Médio Completo"),
    MEDIO_INCOMPLETO("Ensino Médio Incompleto"),
    TECNICO_COMPLETO("Curso Técnico Completo"),
    TECNICO_INCOMPLETO("Curso Técnico Incompleto"),
    GRADUACAO_COMPLETA("Graduação Completa"),
    GRADUACAO_INCOMPLETA("Graduação Incompleta"),
    POS_GRADUACAO_COMPLETA("Pós-graduação Completa"),
    POS_GRADUACAO_INCOMPLETA("Pós-graduação Incompleta"),
    MESTRADO_COMPLETO("Mestrado Completo"),
    MESTRADO_INCOMPLETO("Mestrado Incompleto"),
    DOUTORADO_COMPLETO("Doutorado Completo"),
    DOUTORADO_INCOMPLETO("Doutorado Incompleto");

    private final String descricao;

    FormacaoAcademica(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
