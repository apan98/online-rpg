create table fraction (
    id bigserial not null primary key,
    name varchar not null,
    description varchar not null
);

alter table biography add column fraction_id bigint references fraction(id);
