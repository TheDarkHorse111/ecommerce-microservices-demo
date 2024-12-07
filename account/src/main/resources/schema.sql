CREATE TABLE IF NOT EXISTS account
(
    id         bigserial primary key,
    username   varchar(255) unique not null,
    password   varchar(255)        not null,
    email      VARCHAR(255) UNIQUE NOT NULL,
    created_at TIMESTAMP           NOT NULL,
    updated_at TIMESTAMP
);

CREATE TABLE IF NOT EXISTS cart
(
    id              bigserial primary key,
    account_id      bigint       not null,
    number_of_items int          not null,
    created_at      TIMESTAMP    NOT NULL,
    updated_at      TIMESTAMP,
    status          varchar(255) not null,

    CONSTRAINT fk_account_cart FOREIGN KEY (account_id) REFERENCES account (id)

);

CREATE TABLE IF NOT EXISTS cart_item
(
    id             bigserial primary key,
    cart_id        bigint        not null,
    item_id        bigint        not null,
    quantity       int           not null,
    price_per_item numeric(5, 2) NOT NULL,
    created_at     TIMESTAMP     NOT NULL,
    updated_at     TIMESTAMP,

    CONSTRAINT fk_order FOREIGN KEY (cart_id) REFERENCES cart (id)
);

