# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table cliente (
  id                        bigint auto_increment not null,
  descricao                 varchar(255),
  constraint pk_cliente primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table cliente;

SET FOREIGN_KEY_CHECKS=1;

