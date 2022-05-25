create DATABASE db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categorias(
	id BIGINT AUTO_INCREMENT,
    tipo VARCHAR(255) not null,
    tamanho VARCHAR(255) not null,
    PRIMARY KEY(id)
    
);

create table tb_pizzas(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255) not null,
    observacoes VARCHAR(255) not null,
    preco DECIMAL(6,2),
    categorias_id BIGINT,
    PRIMARY KEY(id),
    FOREIGN KEY(categorias_id) REFERENCES tb_categorias(id)
    
);

INSERT INTO tb_categorias (tipo, tamanho) VALUES("Brotinho", "Doce");
INSERT INTO tb_categorias (tipo, tamanho) VALUES("Grande", "Doce");
INSERT INTO tb_categorias (tipo, tamanho) VALUES("Grande", "Salgada");
INSERT INTO tb_categorias (tipo, tamanho) VALUES("Brotinho", "Salgada");
INSERT INTO tb_categorias (tipo, tamanho) VALUES("Grande c borda", "Salgada");
INSERT INTO tb_categorias (tipo, tamanho) VALUES("Grande c borda", "Doce");


INSERT INTO tb_pizzas(nome, observacoes, preco, categorias_id)VALUES ("Mussarela","Sem cebola",34.99, 2);
INSERT INTO tb_pizzas(nome, observacoes, preco, categorias_id)VALUES ("Brigadeiro","Sem granulado",29.99, 1);
INSERT INTO tb_pizzas(nome, observacoes, preco, categorias_id)VALUES ("Calabreza","Nenhuma",39.99, 6);
INSERT INTO tb_pizzas(nome, observacoes, preco, categorias_id)VALUES ("Portuguesa","Sem cebola",54.99, 6);
INSERT INTO tb_pizzas(nome, observacoes, preco, categorias_id)VALUES ("Beijinho","Sem cravo", 49.90, 2);
INSERT INTO tb_pizzas(nome, observacoes, preco, categorias_id)VALUES ("Moda da Casa","Sem ovos",69.90, 5);
INSERT INTO tb_pizzas(nome, observacoes, preco, categorias_id)VALUES ("Lombo","Sem azeitonas",79.90, 6);
INSERT INTO tb_pizzas(nome, observacoes, preco, categorias_id)VALUES ("Nutella","Com morango",69.90, 2);

SELECT * FROM tb_pizzas WHERE preco > 45;
SELECT * FROM tb_pizzas WHERE preco BETWEEN 50 AND 100;
SELECT * FROM tb_pizzas WHERE nome LIKE "%M%";
SELECT * FROM tb_pizzas INNER JOIN tb_categorias on tb_pizzas.categorias_id = tb_categorias.id;
SELECT * FROM tb_pizzas INNER JOIN tb_categorias on tb_pizzas.categorias_id = tb_categorias.id 
WHERE tipo LIKE"%Grande%";
