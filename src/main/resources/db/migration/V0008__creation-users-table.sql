CREATE TABLE users (
    id BIGSERIAL,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NULL,
    password VARCHAR(255) NULL,

    CONSTRAINT pk_users PRIMARY KEY(id)
);
