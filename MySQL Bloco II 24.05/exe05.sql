CREATE DATABASE db_construindo_vidas;

USE db_construindo_vidas;

CREATE TABLE tb_categorias(
id BIGINT AUTO_INCREMENT,
tipo VARCHAR(255) NOT NULL,
fornecedor VARCHAR(255) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    quantidade INT NOT NULL,
    data_entrada DATE,
    preco_un DECIMAL(6,2),
    categoria_id BIGINT,
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias(tipo, fornecedor) VALUES ("Ceramica|Porcelanato", "CeraHouse");
INSERT INTO tb_categorias(tipo, fornecedor) VALUES ("Tintas|Verniz", "Colors");
INSERT INTO tb_categorias(tipo, fornecedor) VALUES ("Ferramentas", "Martela");
INSERT INTO tb_categorias(tipo, fornecedor) VALUES ("Portas|Janelas", "PortalHouse");

INSERT INTO tb_produtos(nome, quantidade, data_entrada, preco_un, categoria_id)
VALUES("Tinta Branca", 50, "2022-05-15", 105.99,2);
INSERT INTO tb_produtos(nome, quantidade, data_entrada, preco_un, categoria_id)
VALUES("Porcelanato Fino", 500, "2022-04-25", 59.99,1);
INSERT INTO tb_produtos(nome, quantidade, data_entrada, preco_un, categoria_id)
VALUES("Janela Veneza", 90, "2022-03-25", 259.99,4);
INSERT INTO tb_produtos(nome, quantidade, data_entrada, preco_un, categoria_id)
VALUES("Verniz Brilhante", 150, "2022-02-05", 95.99,4);
INSERT INTO tb_produtos(nome, quantidade, data_entrada, preco_un, categoria_id)
VALUES("Janela Vitro", 50, "2022-05-15", 105.99,2);
INSERT INTO tb_produtos(nome, quantidade, data_entrada, preco_un, categoria_id)
VALUES("Tinta Gelo", 50, "2022-05-15", 105.99,2);
INSERT INTO tb_produtos(nome, quantidade, data_entrada, preco_un, categoria_id)
VALUES("Martelo", 50, "2022-01-1",39.99 ,3);
INSERT INTO tb_produtos(nome, quantidade, data_entrada, preco_un, categoria_id)
VALUES("Porta Portal Economic", 150, "2022-07-15", 169.99 ,4);

SELECT * FROM tb_produtos WHERE preco_un > 100;
SELECT * FROM tb_produtos WHERE preco_un BETWEEN 70 and 150;
SELECT * FROM tb_produtos INNER JOIN tb_categorias on tb_produtos.categoria_id = tb_categorias.id;
SELECT * FROM tb_produtos INNER JOIN tb_categorias on tb_produtos.categoria_id = tb_categorias.id
WHERE tipo LIKE "%Ferramentas%";
