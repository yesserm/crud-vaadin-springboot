CREATE TABLE customers (
                           id SERIAL PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           email VARCHAR(255) NOT NULL,
                           phone VARCHAR(50),
                           address VARCHAR(255),
                           city VARCHAR(100),
                           state VARCHAR(100),
                           zip VARCHAR(20),
                           country VARCHAR(100)
);