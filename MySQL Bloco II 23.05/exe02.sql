-- Criação do Banco de Dados
create database db_mercado;

-- Acessar o Banco de Dados
use db_mercado;

-- Criar Tabela
create table produtos(
	id bigint auto_increment,
    nomeProduto varchar(50),
	categoria varchar(50),
    preco decimal(6,2) not null,
    data_validade date,
    quantidade int,
    primary key(id)
    
);

-- Visualiza todos os dados
select * from produtos;

-- Insere dados na tabela
insert into produtos(nomeProduto, categoria, preco, data_validade, quantidade)
values("Arroz", "farinaceos", 24.99, "2023-08-10", 500);


insert into produtos(nomeProduto, categoria, preco, data_validade, quantidade)
values("Bala Fini Amora", "Mercearia", 5.99, "2022-10-10", 200);

insert into produtos(nomeProduto, categoria, preco, data_validade, quantidade)
values("Mussarela", "laticínios", 24.99, "2023-07-10", 30);



-- Visualiza somente o nome e o preço formatado para Reais
select nomeProduto, concat('R$: ', format(preco, 2, 'pt_BR'))as preço from produtos;

-- Retorne todes os produtos com o valor maior do que 500
select nomeProduto, preco from produtos where preco > 500;

-- Retorne todes os produtos com o valor menor do que 500.
select nomeProduto, preco from produtos where preco < 500;

-- Atualizando um registro de cadastro
update produtos set nomeProduto= "Arroz" where id = 4;
