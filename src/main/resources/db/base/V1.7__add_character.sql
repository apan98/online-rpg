create table character(
    id bigserial not null primary key,
    name varchar not null,
    description varchar not null
);

create table person_character(
    id bigserial not null primary key,
    person_id bigint not null references person(id),
    character_id bigint not null references character(id),
    value bigint not null
)