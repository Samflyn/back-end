create table if not exists employee (
    id bigserial not null,
    phone bigint,
    email varchar(255),
    first_name varchar(255),
    last_name varchar(255),
    primary key (id));
