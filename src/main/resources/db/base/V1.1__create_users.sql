create table person (
    id bigserial not null primary key,
    name varchar not null,
    surname varchar,
    lastName varchar,
    dateBirth date not null
);
