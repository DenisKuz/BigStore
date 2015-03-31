CREATE TABLE consumer (
       id serial not null,
       first_name varchar(40) not null,
       last_name varchar(40) not null,
       patronymic varchar(40) not null,
       password varchar(40) not null,
       CONSTRAINT consumer_id_pkey PRIMARY KEY (id)
);

INSERT INTO consumer (first_name, last_name, patronymic, password) VALUES ('Иванов','Иван','Иванович','12345');