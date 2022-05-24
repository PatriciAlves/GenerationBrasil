-- Visualiza todos os dados da tabela tb_produtos
SELECT * FROM tb_produtos;

select * from tb_produtos where preco > 5.50 and categoria_id =2;

select * from tb_produtos where preco > 5.50 or categoria_id =2;

select * from tb_produtos where not categoria_id = 2 order by nome;

select * from tb_produtos where preco in (5,10,15);

select * from tb_produtos where preco between 5 and 15;

select * from tb_produtos where dtvalidade between '2022-03-10' and '2022-03-15' order by dtvalidade;

select * from tb_produtos where dtvalidade between '2022-03-10' and '2022-03-15' order by dtvalidade desc;

-- busca por string (like)
select * from tb_produtos where nome like "%ma%";

select * from tb_produtos where nome like "ma%";

select * from tb_produtos where nome like "%ma";

select count(*) from tb_produtos;

select count(categoria_id) from tb_produtos;

-- soma simples
select sum(preco) from tb_produtos;

-- media dos valores
select avg(preco) from tb_produtos; 

-- media dos valores por categoria
select avg(preco) as media from tb_produtos group by categoria_id; 

-- busca o maior valor
select max(preco) from tb_produtos;

-- busca o menor valor 
select min(preco) from tb_produtos;

select * from tb_produtos inner join tb_categorias
 on tb_produtos.categoria_id= tb_categorias.id;
