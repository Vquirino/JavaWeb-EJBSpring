drop database if exists aula;
create database aula;

use aula;

create table produto(
	idproduto		integer			auto_increment,
	nome			varchar(35)		not null,
	preco			double			not null,
	primary key(idproduto)
);

desc produto;

insert into produto(nome, preco) values('Notebook', 2000);
insert into produto(nome, preco) values('Monitor', 500);
insert into produto(nome, preco) values('Mouse', 50);
insert into produto(nome, preco) values('Computador', 1000);

select * from produto;