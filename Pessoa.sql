create table Pessoa(
nomeCompleto varchar(100),
endereco varchar(100),
sexo varchar(20),
idade numeric,
rg numeric,
data_nascimento numeric
);

insert into Pessoa values(111111,'Jonas', 'Rua da dua', 'M', 28 , 23568885, 2002);

select * from Pessoa;

create role Aluno;
create role Professor;

