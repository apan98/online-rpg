create table resource_type (
  id bigserial not null primary key,
  name varchar not null,
  description varchar not null
);

create table resource (
  id bigserial not null primary key,
  name varchar not null,
  description varchar not null,
  density bigint not null,
  rarity bigint not null,
  type_id bigint references resource_type(id)
);

create table location (
  id bigserial not null primary key,
  name varchar not null,
  description varchar not null,
  country_id bigint references country(id)
);

create table location_object (
   id bigserial not null primary key,
   name varchar not null,
   description varchar not null
);

