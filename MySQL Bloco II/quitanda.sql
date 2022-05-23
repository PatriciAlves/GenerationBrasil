create database db_quitanda;

use db_quitanda;
create table tb_produtos(
	id bigint auto_increment,
    nome varchar(255) not null,
    quantidade int,
    data_validade date,
    preco decimal not null,
    primary key(id)
);

insert into tb_produtos(nome, quantidade, data_validade, preco)
values("uva",20,"2022-05-30", 5.99);

insert into tb_produtos(nome, quantidade, data_validade, preco)
values("morango",25,"2022-06-10", 5.99);

insert into tb_produtos(nome, quantidade, data_validade, preco)
values("Laranja",55,"2022-06-01", 1.99);

insert into tb_produtos(nome, quantidade, data_validade, preco)
values("Abacaxi",80,"2022-06-30", 3.99);

update tb_produtos set preco = 8.99 where id = 1;
select * from tb_produtos;

select nome_produto, concat('R$: ', format(preco, 2, 'pt_BR'))as preço from tb_produtos;

alter table tb_produtos modify preco decimal(6,2);

select * from tb_produtos order by nome;

alter table tb_produtos change nome nome_produto varchar(255);
