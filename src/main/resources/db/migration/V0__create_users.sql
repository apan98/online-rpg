create table users (
  id bigserial not null primary key,
  username varchar (255) not null,
  password varchar(255) not null,
  role varchar(255) not null,
  constraint users_username_unq unique (username)
);
INSERT INTO users (username, password, role) VALUES ('admin', '$2a$10$gws27uYUvaYVi.7E8vRFyeQR/.00VSeib.amdTibYjcratki83mDG', 'ADMIN');
INSERT INTO users (username, password, role) VALUES ('user', '$2a$10$f3JZXJPG6jhcya0D.pEMkeq7EM3st8qNmIzPNEGIhQQ7Oy1BBmpAK', 'USER');
