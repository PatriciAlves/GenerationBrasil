-- Criação do Banco de Dados
create database db_funcionarios;

-- Acessar o Banco de Dados
use db_funcionarios;

-- Criar Tabela
create table funcionarios(
	id bigint auto_increment,
    nome varchar(50),
    cpf varchar(11) not null,
    cargo varchar(50) not null,
    salario decimal(6,2) not null,
    data_admissao date,
    ativo boolean,
    primary key(id)
    
);

-- Visualiza todos os dados
select * from funcionarios;

-- Insere dados na tabela
insert into funcionarios(nome, cpf, cargo, salario, data_admissao, ativo)
values("Patricia Souza", 123456789, "Desenvolvedor(a) Jr", 2500.00, "2022-07-30", true );

insert into funcionarios(nome, cpf, cargo, salario, data_admissao, ativo)
values("Mauricio Alves", 987654321, "Estagiário", 1060.00, "2019-12-26", true );

insert into funcionarios(nome, cpf, cargo, salario, data_admissao, ativo)
values("Mauricio Alves", 987654321, "Contador Senior", 7560.00, "2019-12-26", false );


insert into funcionarios(nome, cpf, cargo, salario, data_admissao, ativo)
values("Monica de Amorim", 999666555, "Desenvolvedor(a) Senior", 15500.00, "2015-02-08", true );

insert into funcionarios(nome, cpf, cargo, salario, data_admissao, ativo)
values("Marcelo Carlos", 102360589, "Analista de Recursos Humanos", 4500.00, "2020-09-30", true );

-- Visualiza somente o nome e o preço formatado para Reais
select nome, concat('R$: ', format(salario, 2, 'pt_BR'))as preço from funcionarios;

-- Retorne todes os colaboradores com o salário maior do que 2000
select nome, salario from funcionarios where salario > 2000;

-- retorne todes os colaboradores com o salário menor do que 2000.
select nome, salario from funcionarios where salario < 2000;

-- Atualizando um registro de cadastro
update funcionarios set salario = 9500 where id = 4;
