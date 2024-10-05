create table carritos (
  id bigint primary key generated always as identity,
  idusuario bigint not null,
  total double precision not null,
  constraint fk_usuario foreign key (idusuario) references usuarios (id)
);