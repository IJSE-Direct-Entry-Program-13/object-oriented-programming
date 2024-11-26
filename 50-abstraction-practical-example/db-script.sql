CREATE TABLE customer
(
    id      VARCHAR(10) PRIMARY KEY,
    name    VARCHAR(100) NOT NULL,
    address VARCHAR(400) NOT NULL
);

TABLE customer;

INSERT INTO customer (id, name, address)
VALUES ('C003', 'Upul', 'Maharagama');

DELETE
FROM customer
WHERE id = 'C001';