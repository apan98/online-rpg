alter table users add column printing_speed double precision not null default 0.0;

create table print_session (
  id bigserial not null primary key,
  time time not null,
  errors bigint not null,
  text_size bigint not null,
  user_id bigint not null references users(id)
);