CREATE TABLE IF NOT EXISTS purchase_order
(
    id         bigserial primary key,
    order_id   bigint        not null,
    cart_id    bigint        not null,
    total      numeric(5, 2) NOT NULL,
    payed_at   TIMESTAMP     NOT NULL,
    created_at TIMESTAMP     NOT NULL,
    updated_at TIMESTAMP,
    status     varchar(255),

    CONSTRAINT fk_order FOREIGN KEY (order_id) REFERENCES purchase_order (id)
);

