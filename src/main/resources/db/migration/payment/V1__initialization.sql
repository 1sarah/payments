CREATE TABLE payments
(
    id             UUID             NOT NULL,
    payment_status VARCHAR(255),
    transaction_id VARCHAR(255),
    order_id       UUID,
    amount         DOUBLE PRECISION NOT NULL,
    CONSTRAINT pk_payments PRIMARY KEY (id)
);