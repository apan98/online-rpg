-- create table race (
--     id bigserial not null primary key,
--     name varchar(50) not null,
--     description text not null,
--     character jsonb
-- );
--
-- create table history_step (
--     id bigserial not null primary key,
--     name varchar(255) not null,
--     description text not null
-- );
--
-- create table history_person (
--     id bigserial not null primary key,
--     name varchar(255) not null,
--     description text not null,
--     history_step_id bigint references history_step(id),
--     character jsonb
-- );
--
-- create table person_base_character (
--     id bigserial not null primary key,
--     strength smallint not null,
--     agility smallint not null,
--     charisma smallint not null,
--     intelligence smallint not null
-- );
--
-- create table person (
--     id bigserial not null primary key,
--     first_name varchar(255) not null,
--     last_name varchar(255) not null,
--     nickname varchar(255) not null,
--     race_id bigint references race(id),
--     bio text,
--     person_character_id bigint references character_person_base (id)
-- );

create table race (
    id bigserial not null primary key
);

create table history_step (
    id bigserial not null primary key
);

create table history_person (
    id bigserial not null primary key
);

create table person_base_character (
    id bigserial not null primary key
);

create table person (
    id bigserial not null primary key
);

