CREATE TABLE IF NOT EXISTS item
(
    id         bigserial primary key,
    item_name  varchar(255) unique not null,
    price      numeric(5, 2)       not null,
    created_at TIMESTAMP           NOT NULL,
    updated_at TIMESTAMP
);