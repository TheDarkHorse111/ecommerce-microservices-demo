CREATE TABLE IF NOT EXISTS cart
(
    id                 bigserial primary key,
    account_id         bigint       not null,
    number_of_items    int          not null default 0,
    created_at         TIMESTAMP    NOT NULL,
    last_item_added_at TIMESTAMP,
    status             varchar(255) not null
);

CREATE TABLE IF NOT EXISTS cart_items
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

