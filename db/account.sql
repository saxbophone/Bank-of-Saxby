CREATE TABLE account (
    id SERIAL PRIMARY KEY NOT NULL, -- Auto-incrementing Primary Key
    name VARCHAR(255) NOT NULL, -- String name of account holder (company or person name)
    balance NUMERIC(15, 2) DEFAULT 0.00 NOT NULL, -- Numeric balance, 13 leading digits with 2 decimal places (max = 9,999,999,999,999.99)
    allow_cash BOOLEAN DEFAULT FALSE NOT NULL, -- Boolean on whether this account is allowed cash withdrawals or deposits
    active BOOLEAN DEFAULT FALSE NOT NULL -- Boolean for if this account is active or not.
);
