create schema if not exists joinews;

create table if not exists joinews.clients (
    id uuid primary key,
    name varchar(255) not null,
    email varchar(255) null
);