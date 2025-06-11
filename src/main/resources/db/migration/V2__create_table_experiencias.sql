CREATE TABLE experiencias (
    id BIGSERIAL PRIMARY KEY,
    objetivo VARCHAR(1000)
);

CREATE TABLE experiencias_experiencia (
    experiencias_id BIGINT NOT NULL,
    experiencia VARCHAR(1000),
    CONSTRAINT fk_experiencias_experiencia FOREIGN KEY (experiencias_id)
        REFERENCES experiencias (id) ON DELETE CASCADE
);

CREATE TABLE experiencias_habilidades (
    experiencias_id BIGINT NOT NULL,
    habilidades VARCHAR(1000),
    CONSTRAINT fk_experiencias_habilidades FOREIGN KEY (experiencias_id)
        REFERENCES experiencias (id) ON DELETE CASCADE
);