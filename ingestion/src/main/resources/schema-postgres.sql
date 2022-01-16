    drop table if exists category cascade;
    drop table if exists clean cascade;
    drop table if exists cycle cascade;
    drop table if exists event cascade;
    drop table if exists label cascade;
    drop table if exists permission cascade;
    drop table if exists raw cascade;
    drop table if exists rol cascade;
    drop table if exists users cascade;


    drop sequence if exists hibernate_sequence;

    create sequence hibernate_sequence start 1 increment 1;


    create table category (
       id int4 not null,
        description varchar(255),
        name varchar(255),
        threshold float8,
        primary key (id)
    );


    create table clean (
       id int4 not null,
        client varchar(255),
        currency varchar(255),
        dataset_id int4,
        default_category varchar(255),
        description varchar(255),
        fiscal_year varchar(255),
        invoice_code varchar(255),
        spend float8,
        timestamp timestamp,
        user_name varchar(255),
        vendor varchar(255),
        primary key (id)
    );

    create table cycle (
       id int4 not null,
        dataset_id int4,
        iteration int4,
        last_cycle boolean,
        primary key (id)
    );

    create table event (
       id int4 not null,
        name varchar(255),
        primary key (id)
    );

    create table event_history (
       id int4 not null,
        cycle_id int4,
        dataset_id int4,
        end_date date,
        last_modified date,
        start_date date,
        status varchar(255),
        user_id int4,
        event_id int4 not null,
        primary key (id)
    );

    create table label (
       id int4 not null,
        category_id int4,
        clean_id int4,
        cycle_id int4,
        dataset_id int4,
        primary key (id)
    );


    create table permission (
       id int4 not null,
        name varchar(255),
        primary key (id)
    );

    create table raw (
       id int4 not null,
        client varchar(255),
        currency varchar(255),
        dataset_id int4,
        default_category varchar(255),
        description varchar(255),
        fiscal_year varchar(255),
        invoice_code varchar(255),
        spend float8,
        timestamp timestamp,
        user_name varchar(255),
        vendor varchar(255),
        primary key (id)
    );


    create table rol (
       id int4 not null,
        name varchar(255),
        primary key (id)
    );


    create table users (
       id int4 not null,
        client varchar(255),
        user_name varchar(255),
        user_status varchar(255),
        user_surname varchar(255),
        permission_id int4 not null,
        rol_id int4 not null,
        primary key (id)
    );

    alter table event_history
       add constraint FKlef0qi8d85ucr0ed19r8jk8oo
       foreign key (event_id)
       references event;

    alter table event_history
       add constraint FKa201cu0xeo9hkp7akwhu891dp
       foreign key (user_id)
       references users;

    alter table users
       add constraint FKho3mbu2bnehxlpdmolc9f3h0m
       foreign key (permission_id)
       references permission;

    alter table users
       add constraint FKd2duok4cimxgheox9o327ldo8
       foreign key (rol_id)
       references rol;