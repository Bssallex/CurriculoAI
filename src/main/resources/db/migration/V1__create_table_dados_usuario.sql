CREATE TABLE dados_usuario (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    endereco VARCHAR(255),
    telefone VARCHAR(50),
    formacao VARCHAR(50)
);

CREATE TABLE dados_usuario_cursos (
    dados_usuario_id BIGINT NOT NULL,
    cursos VARCHAR(255),
    CONSTRAINT fk_dados_usuario_cursos FOREIGN KEY (dados_usuario_id)
        REFERENCES dados_usuario (id) ON DELETE CASCADE
);

CREATE TABLE dados_usuario_idiomas (
    dados_usuario_id BIGINT NOT NULL,
    idiomas VARCHAR(255),
    CONSTRAINT fk_dados_usuario_idiomas FOREIGN KEY (dados_usuario_id)
        REFERENCES dados_usuario (id) ON DELETE CASCADE
);