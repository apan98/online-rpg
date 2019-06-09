create table country (
    id bigserial not null primary key,
    name varchar not null,
    description varchar not null
);

alter table biography add column homeland_id bigint references country(id);
