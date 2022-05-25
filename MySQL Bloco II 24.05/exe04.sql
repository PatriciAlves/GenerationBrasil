create DATABASE db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categorias(
	id BIGINT AUTO_INCREMENT,
    tipo VARCHAR(255),
    fornecedor VARCHAR(255),
    PRIMARY KEY(id)
);

create table tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255),
    qnt_kg DECIMAL(6,1),
    preco_kg DECIMAL(6,2),
    data_venc DATE,
    categoria_id BIGINT,
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categorias(id)
);

INSERT INTO tb_categorias(tipo, fornecedor) VALUES ("Carne Bovina", "Oboi");
INSERT INTO tb_categorias(tipo, fornecedor) VALUES ("Carne Suina", "Roinc");
INSERT INTO tb_categorias(tipo, fornecedor) VALUES ("Carne Frango", "Cocorico");
INSERT INTO tb_categorias(tipo, fornecedor) VALUES ("Linguiça", "Saara");

INSERT INTO tb_produtos(nome, qnt_kg, preco_kg, data_venc, categoria_id)
VALUES("Acem", 250.0, 29.99, "2022-12-12",1);
INSERT INTO tb_produtos(nome, qnt_kg, preco_kg, data_venc, categoria_id
)VALUES("Picanha", 350.0, 59.90, "2022-09-22",1);
INSERT INTO tb_produtos(nome, qnt_kg, preco_kg, data_venc, categoria_id)
VALUES("Panceta", 150.0, 22.90, "2022-08-02",3);
INSERT INTO tb_produtos(nome, qnt_kg, preco_kg, data_venc, categoria_id)
VALUES("File Frango", 400.0, 15.99, "2022-07-12",3);
INSERT INTO tb_produtos(nome, qnt_kg, preco_kg, data_venc, categoria_id)
VALUES("Coxa e Sobrecoxa", 550.0, 8.99, "2022-07-02",1);
INSERT INTO tb_produtos(nome, qnt_kg, preco_kg, data_venc, categoria_id)
VALUES("Linguiça Peru", 350.0, 19.90, "2022-08-22",4);
INSERT INTO tb_produtos(nome, qnt_kg, preco_kg, data_venc, categoria_id
)VALUES("Linguiça Frango", 350.0, 15.99, "2022-12-12",4);
INSERT INTO tb_produtos(nome, qnt_kg, preco_kg, data_venc, categoria_id)
VALUES("Linguiça Mista", 250.0, 14.90,"2022-12-12",4);



SELECT * FROM tb_produtos WHERE preco_kg > 50;
SELECT * FROM tb_produtos WHERE preco_kg BETWEEN 50 AND 150;
SELECT * FROM tb_produtos WHERE nome LIKE "%C%";
SELECT * FROM tb_produtos INNER JOIN tb_categorias on tb_produtos.categoria_id = tb_categorias.id;
SELECT * FROM tb_produtos INNER JOIN tb_categorias on tb_produtos.categoria_id = tb_categorias.id 
WHERE tipo LIKE "%Linguiça%";

