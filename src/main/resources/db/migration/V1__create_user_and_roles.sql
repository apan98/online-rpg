CREATE TABLE roles (
  id bigserial not null primary key,
  authority varchar(32),
  CONSTRAINT role_authority_unq UNIQUE (authority)
);
create table users (
  id bigserial not null primary key,
  username varchar (255),
  password varchar(255),
  roles_id bigint constraint user_role_fk references roles(id) not null,
  constraint users_username_unq unique (username)
);

INSERT INTO roles (authority) VALUES ('ADMIN'), ('USER');
INSERT INTO users (username, password, roles_id) VALUES ('admin', '$2a$10$gws27uYUvaYVi.7E8vRFyeQR/.00VSeib.amdTibYjcratki83mDG', 1);
INSERT INTO users (username, password, roles_id) VALUES ('user', '$2a$10$f3JZXJPG6jhcya0D.pEMkeq7EM3st8qNmIzPNEGIhQQ7Oy1BBmpAK', 2);
