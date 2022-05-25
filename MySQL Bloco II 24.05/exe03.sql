create DATABASE db_farmacia_bem_estar;

use db_farmacia_bem_estar;

create table tb_categorias(
	id BIGINT AUTO_INCREMENT,
    tipo VARCHAR(255) not null,
    fornecedor VARCHAR(255),
    PRIMARY KEY(id)
    
);

create table tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) not null,
    preco DECIMAL(6,2),
    qtd INT,
    categorias_id BIGINT,
    PRIMARY KEY(id),
    FOREIGN KEY(categorias_id) REFERENCES tb_categorias(id)
    
);

INSERT INTO tb_categorias (tipo, fornecedor) VALUES("Medicamentos", "Pharma");
INSERT INTO tb_categorias (tipo, fornecedor) VALUES("Genericos", "Ems");
INSERT INTO tb_categorias (tipo, fornecedor) VALUES("Higiene e Beleza", "Dove");
INSERT INTO tb_categorias (tipo, fornecedor) VALUES("Bebês", "Pompom");
INSERT INTO tb_categorias (tipo, fornecedor) VALUES("Home Care", "Bio Therme");



INSERT INTO tb_produtos(nome, preco, qtd, categorias_id)VALUES ("Dipirona", 5.99, 200, 1);
INSERT INTO tb_produtos(nome, preco, qtd, categorias_id)VALUES ("Desedorante", 25.99, 50, 3);
INSERT INTO tb_produtos(nome, preco, qtd, categorias_id)VALUES ("Anti-Hipertensivo", 12.50, 500, 2);
INSERT INTO tb_produtos(nome, preco, qtd, categorias_id)VALUES ("Anti-Concepcionais", 9.99, 1500, 2);
INSERT INTO tb_produtos(nome, preco, qtd, categorias_id)VALUES ("Anti-Inflamatorio", 15.99, 2000, 1);
INSERT INTO tb_produtos(nome, preco, qtd, categorias_id)VALUES ("Fraldas bebes", 35.99, 260, 4);
INSERT INTO tb_produtos(nome, preco, qtd, categorias_id)VALUES ("shampoo", 15.99, 150, 3);
INSERT INTO tb_produtos(nome, preco, qtd, categorias_id)VALUES ("Fraldas Geriatricas", 45.99, 250, 5);

SELECT * FROM tb_produtos;
SELECT * FROM tb_categorias;
SELECT * FROM tb_produtos WHERE preco > 60;
SELECT * FROM tb_produtos WHERE preco BETWEEN 5 AND 60;
SELECT * FROM tb_produtos WHERE nome LIKE "%C%";
SELECT * FROM tb_produtos INNER JOIN tb_categorias on tb_produtos.categorias_id = tb_categorias.id;
SELECT * FROM tb_produtos INNER JOIN tb_categorias on tb_produtos.categorias_id = tb_categorias.id 
WHERE tipo LIKE"%Medicamentos%";
