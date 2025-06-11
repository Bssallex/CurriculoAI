-- Adiciona a coluna de chave estrangeira na tabela de experiências
ALTER TABLE experiencias
ADD COLUMN usuario_id BIGINT;

-- Define a chave estrangeira
ALTER TABLE experiencias
ADD CONSTRAINT fk_experiencias_usuario
FOREIGN KEY (usuario_id)
REFERENCES dados_usuario(id)
ON DELETE CASCADE;