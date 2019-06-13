create table skill(
    id bigserial not null primary key,
    name varchar not null,
    description varchar not null
);

create table person_skill(
    id bigserial not null primary key,
    person_id bigint not null references person(id),
    skill_id bigint not null references skill(id),
    value bigint not null
)