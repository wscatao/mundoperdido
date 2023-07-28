CREATE TABLE IF NOT EXISTS dinossauro(
 id SERIAL PRIMARY KEY,
 nome VARCHAR(255) NOT NULL,
 altura DECIMAL(5,2) NOT NULL,
 peso DECIMAL(7,2) NOT NULL,
 especie VARCHAR(255) NOT NULL,
 localizacao VARCHAR(255) NOT NULL,
 data_criacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO dinossauro(nome, altura, peso, especie, localizacao) VALUES
('T-Rex', 3.5,500,'Tyrannosaurus Rex', 'América do Norte'),
('Velociraptor', 1.8,15,'Velociraptor mongoliensis', 'Mongólia'),
('Triceratops', 3,8000,'Triceratops horridus', 'América do Norte');

