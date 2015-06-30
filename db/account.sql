CREATE TABLE account (
    id SERIAL PRIMARY KEY, -- Auto-incrementing Primary Key
    name VARCHAR(255), -- String name of account holder (company or person name)
    balance NUMERIC(15, 2) DEFAULT 0.00 -- Numeric balance, 13 leading digits with 2 decimal places (max = 9,999,999,999,999.99)
);
