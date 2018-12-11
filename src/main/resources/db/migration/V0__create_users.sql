create table roles (
  id bigserial not null primary key,
  code varchar (255) not null,
  constraint role_code_unq unique (code)
);

insert into roles (code) values ('ROLE_ADMIN');
insert into roles (code) values ('ROLE_USER');

create table users (
  id bigserial not null primary key,
  username varchar (255) not null,
  password varchar(255) not null,
  role_id bigint not null references roles(id),
  constraint users_username_unq unique (username)
);

INSERT INTO users (username, password, role_id) VALUES ('admin', '$2a$10$gws27uYUvaYVi.7E8vRFyeQR/.00VSeib.amdTibYjcratki83mDG', 1);
INSERT INTO users (username, password, role_id) VALUES ('user', '$2a$10$f3JZXJPG6jhcya0D.pEMkeq7EM3st8qNmIzPNEGIhQQ7Oy1BBmpAK', 2);
