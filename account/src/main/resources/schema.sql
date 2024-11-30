CREATE TABLE IF NOT EXISTS account
(
    id         bigserial primary key,
    username   varchar(255) unique not null,
    password   varchar(255)        not null,
    email      VARCHAR(255) UNIQUE NOT NULL,
    created_at TIMESTAMP           NOT NULL,
    updated_at TIMESTAMP
);