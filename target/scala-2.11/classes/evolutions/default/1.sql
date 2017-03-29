# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  cat_id                        bigint not null,
  cat_name                      varchar(255),
  constraint pk_category primary key (cat_id)
);
create sequence category_seq;

create table event (
  event_id                      bigint not null,
  event_name                    varchar(255),
  time                          varchar(255),
  location                      varchar(255),
  date                          varchar(255),
  title                         varchar(255),
  constraint pk_event primary key (event_id)
);
create sequence event_seq;

create table order (
  order_id                      bigint not null,
  user_id                       bigint,
  order_date                    timestamp,
  total_cost                    double,
  constraint pk_order primary key (order_id)
);
create sequence order_seq;

create table ticket (
  ticket_id                     bigint not null,
  event_id                      bigint,
  ticket_type                   varchar(255),
  quantity                      integer,
  qty                           integer,
  price                         double,
  events_event_id               bigint,
  constraint pk_ticket primary key (ticket_id)
);
create sequence ticket_seq;

create table user (
  user_id                       bigint not null,
  role                          varchar(255),
  username                      varchar(255),
  email                         varchar(255),
  address1                      varchar(255),
  address2                      varchar(255),
  town                          varchar(255),
  city                          varchar(255),
  security_ans                  varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (user_id)
);
create sequence user_seq;

create table event_category (
  event_id                      bigint not null,
  cat_id                        bigint,
  constraint pk_event_category primary key (event_id)
);
create sequence event_category_seq;

create table order_ticket (
  ticket_id                     bigint not null,
  order_id                      bigint,
  qty                           integer,
  cost                          double,
  constraint pk_order_ticket primary key (ticket_id)
);
create sequence order_ticket_seq;

alter table ticket add constraint fk_ticket_events_event_id foreign key (events_event_id) references event (event_id) on delete restrict on update restrict;
create index ix_ticket_events_event_id on ticket (events_event_id);


# --- !Downs

alter table ticket drop constraint if exists fk_ticket_events_event_id;
drop index if exists ix_ticket_events_event_id;

drop table if exists category;
drop sequence if exists category_seq;

drop table if exists event;
drop sequence if exists event_seq;

drop table if exists order;
drop sequence if exists order_seq;

drop table if exists ticket;
drop sequence if exists ticket_seq;

drop table if exists user;
drop sequence if exists user_seq;

drop table if exists event_category;
drop sequence if exists event_category_seq;

drop table if exists order_ticket;
drop sequence if exists order_ticket_seq;

