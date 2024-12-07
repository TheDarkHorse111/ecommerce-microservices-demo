CREATE TABLE IF NOT EXISTS purchase_order
(
    id         bigserial primary key,
    cart_id    bigint        not null,
    total      numeric(5, 2) NOT NULL,
    payed_at   TIMESTAMP     NOT NULL,
    created_at TIMESTAMP     NOT NULL,
    updated_at TIMESTAMP,
    status     varchar(255)  NOT NULL
);

