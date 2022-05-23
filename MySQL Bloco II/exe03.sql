create database db_escola;

-- Acessar o Banco de Dados
use db_escola;

-- Criar Tabela
create table aluno(
	id bigint auto_increment,
    nome varchar(50) not null,
	cpf varchar(15) not null,
    sala varchar(50) not null,
    materia varchar(50),
    turno varchar(50) not null,
	nota1 int,
	nota2 int,
    nota3 int,
    primary key(id)
    
);

-- Visualiza todos os dados
select * from aluno;

-- Insere dados na tabela
insert into aluno(nome, cpf, sala, materia, turno, nota1, nota2, nota3)
values("Carolina Batista", "104.556.366-99", "3°A - Ensino Médio","Matematica", "Noturno", 10, 5, 7);

insert into aluno(nome, cpf, sala, materia, turno, nota1, nota2, nota3)
values("Anna Silva ", "580.556.366-99", "3°A - Ensino Médio","Matematica", "Noturno", 9, 8, 7);

-- Retorne todes o/a(s) estudantes com a nota maior do que 7.0
select nome, nota1 from aluno where nota1 > 7;

-- Retorne todes o/a(s) estudantes com a nota menor do que 7.0
select nome, nota1 from aluno where nota1 < 7;

-- Atualizando um registro de cadastro
update aluno set turno = "Manhã" where id = 1;

