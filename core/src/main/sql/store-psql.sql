CREATE TABLE consumer (
       login varchar(20) not null,
       password varchar(40) not null,
       first_name varchar(40) not null,
       last_name varchar(40) not null,
       patronymic varchar(40) not null,
       CONSTRAINT consumer_id_pkey PRIMARY KEY (login)
);

INSERT INTO consumer (first_name, last_name, patronymic, login, password) VALUES ('Иванов','Иван','Иванович','ivan','12345');
INSERT INTO consumer (first_name, last_name, patronymic, login, password) VALUES ('Петров','Николай','Иванович','petr','45000');
INSERT INTO consumer (first_name, last_name, patronymic, login, password) VALUES ('Галин','Николай','Олегович','gal123','45000');