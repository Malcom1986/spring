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

CREATE TABLE departments
(
    id         SERIAL PRIMARY KEY,
    name       varchar(15),
    max_salary int,
    min_salary int
);

CREATE TABLE employees
(
    id            SERIAL PRIMARY KEY,
    name          varchar(15),
    surname       varchar(25),
    salary        int,
    department_id int FOREIGN KEY (department_id) REFERENCES my_db.departments (id)
);



CREATE TABLE children
(
    id   SERIAL,
    name varchar(15),
    age  int,
    PRIMARY KEY (id)
);

CREATE TABLE section
(
    id   SERIAL,
    name varchar(15),
    PRIMARY KEY (id)
);

CREATE TABLE child_section
(
    id SERIAl PRIMARY KEY,
    child_id   int NOT NULL,
    section_id int NOT NULL,
    FOREIGN KEY (child_id) REFERENCES children (id),
    FOREIGN KEY (section_id) REFERENCES section (id)
);