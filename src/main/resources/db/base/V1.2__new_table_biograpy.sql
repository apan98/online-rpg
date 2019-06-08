create table biography (
    id bigserial not null primary key,
    description varchar,
    person_id bigint references person(id)
);
