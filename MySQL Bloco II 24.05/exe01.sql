create database db_generation_game_online;
 use db_generation_game_online;
 
create table tb_classes(
	id bigint auto_increment,
    tipo_jogo varchar(255),
	primary key (id)
);

create table tb_personagens(
	id bigint auto_increment,
    nome_personagem varchar(50),
    genero varchar(50),
    poder varchar(50),
    fraqueza varchar(50),
    ataque int,
    classes_id bigint,
    primary key (id),
    foreign key(classes_id) references tb_classes(id)

);

insert into tb_classes (tipo_jogo) values ("Aventura");
insert into tb_classes (tipo_jogo) values ("Ação");
insert into tb_classes (tipo_jogo) values ("Suspence");
insert into tb_classes (tipo_jogo) values ("Terror");
insert into tb_classes (tipo_jogo) values ("Divertidos");

select *from tb_classes;


insert into tb_personagens(nome_personagem, genero, poder, fraqueza, ataque, classes_id)
values ("Haduk", "Masculino", "Fogo", "Agua", 1566, 1);
insert into tb_personagens(nome_personagem, genero, poder, fraqueza, ataque, classes_id)
values ("Mario", "Masculino", "Persistencia", "Cogumelos", 2580, 1);
insert into tb_personagens(nome_personagem, genero, poder, fraqueza, ataque, classes_id)
values ("Sonic", "Masculino", "Velocidade", "Fogo", 3500, 1);
insert into tb_personagens(nome_personagem, genero, poder, fraqueza, ataque, classes_id)
values ("Barbie", "Feminino", "Multitarefas", "Desemprego", 1000, 2);
insert into tb_personagens(nome_personagem, genero, poder, fraqueza, ataque, classes_id)
values ("Caramel", "Feminino", "Teletransporte", "velocidade", 3600, 3);
insert into tb_personagens(nome_personagem, genero, poder, fraqueza, ataque, classes_id)
values ("Jack", "Masculino", "Invisibilidade", "Tempo de vida", 1569, 5);
insert into tb_personagens(nome_personagem, genero, poder, fraqueza, ataque, classes_id)
values ("Lizie", "Feminino", "Elastica", "mortal", 600, 3);
insert into tb_personagens(nome_personagem, genero, poder, fraqueza, ataque, classes_id)
values ("Aquiles", "Masculino", "Reneração", "Calcanhar", 1500, 1);

select * from tb_personagens;

select nome_personagem, ataque from  tb_personagens where ataque > 2000;

select nome_personagem, ataque from tb_personagens where ataque > 1000 and ataque < 2000;

select * from tb_personagens where nome_personagem like "C%";

select * from tb_classes inner join tb_personagens
on tb_personagens.classes_id = tb_personagens.id ;





