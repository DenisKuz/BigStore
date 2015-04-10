CREATE TABLE consumer (
  login      VARCHAR(20) NOT NULL,
  password   VARCHAR(40) NOT NULL,
  first_name VARCHAR(40) NOT NULL,
  last_name  VARCHAR(40) NOT NULL,
  CONSTRAINT consumer_id_pkey PRIMARY KEY (login)
);

INSERT INTO consumer (first_name, last_name, login, password) VALUES ('Ivanov', 'Ivan', 'ivan', '12345');
INSERT INTO consumer (first_name, last_name, login, password) VALUES ('Petrov', 'Nikolay', 'petr', '45000');
INSERT INTO consumer (first_name, last_name, login, password) VALUES ('Galin', 'Nikolay', 'gal123', '45000');