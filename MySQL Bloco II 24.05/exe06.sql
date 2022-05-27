CREATE DATABASE db_curso_da_minha_vida;

USE db_curso_da_minha_vida;

CREATE TABLE tb_categorias(
id BIGINT AUTO_INCREMENT,
tipo VARCHAR(255) NOT NULL,
escola VARCHAR(255) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE tb_cursos(
	id BIGINT AUTO_INCREMENT,
    curso VARCHAR(255) NOT NULL,
    tempo_horas INT,
    preco_mes DECIMAL(6,2),
    categoria_id BIGINT,
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias(tipo, escola) VALUES ("Tecnologo", "PG -IT");
INSERT INTO tb_categorias(tipo, escola) VALUES ("Graduacao", "PG -IT");
INSERT INTO tb_categorias(tipo, escola) VALUES ("Especializacao", "Educa");
INSERT INTO tb_categorias(tipo, escola) VALUES ("Licenciatura", "Educa");

INSERT INTO tb_cursos(curso, tempo_horas, preco_mes, categoria_id)VALUES("Tecnologia da Informação", 2400, 459.90 ,1);
INSERT INTO tb_cursos(curso, tempo_horas, preco_mes, categoria_id)VALUES("Engenharia de Sofware", 7200, 859.90 ,2);
INSERT INTO tb_cursos(curso, tempo_horas, preco_mes, categoria_id)VALUES("Ciência da Computação", 3200, 439.90 ,4);
INSERT INTO tb_cursos(curso, tempo_horas, preco_mes, categoria_id)VALUES("Engenharia de Sistemas", 3200, 459.90 ,4);
INSERT INTO tb_cursos(curso, tempo_horas, preco_mes, categoria_id)VALUES("Engenharia de Controle e Automação", 6400, 959.90 ,2);
INSERT INTO tb_cursos(curso, tempo_horas, preco_mes, categoria_id)VALUES("Redes de Computadores", 2400, 659.90 ,1);
INSERT INTO tb_cursos(curso, tempo_horas, preco_mes, categoria_id)VALUES("Data Science", 2400, 559.90 ,1);
INSERT INTO tb_cursos(curso, tempo_horas, preco_mes, categoria_id)VALUES("Game Designer", 2400, 459.90 ,1);


SELECT * FROM tb_cursos WHERE preco_mes > 500;
SELECT * FROM tb_cursos WHERE preco_mes BETWEEN 600 and 1000;
SELECT * FROM tb_cursos WHERE curso LIKE "%J%";
SELECT * FROM tb_cursos INNER JOIN tb_categorias on tb_cursos.categoria_id = tb_categorias.id;tb_postagenstb_postagens
SELECT * FROM tb_cursos INNER JOIN tb_categorias on tb_cursos.categoria_id = tb_categorias.id
WHERE tipo LIKE "%Engenharia%";
