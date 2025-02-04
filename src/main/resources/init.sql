-- CREATE TABLE employees
-- (
--     id         SERIAL PRIMARY KEY,
--     name       VARCHAR(15),
--     surname    VARCHAR(25),
--     department VARCHAR(20),
--     salary     INT
-- );

CREATE TABLE details
(
    id           SERIAL PRIMARY KEY,
    city         varchar(15),
    phone_number varchar(25),
    email        varchar(30)
);

CREATE TABLE employees
(
    id         SERIAL PRIMARY KEY,
    name       varchar(15),
    surname    varchar(25),
    department varchar(20),
    salary     int,
    details_id int,
    FOREIGN KEY (details_id) REFERENCES details (id)
);