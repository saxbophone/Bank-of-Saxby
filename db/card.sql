CREATE TABLE card (
    id SERIAL PRIMARY KEY, -- Auto-incrementing Primary Key
    account SERIAL REFERENCES account(id), -- Foreign Key to account table - the account this card belongs to
    no NUMERIC(16), -- 16-digit integer card number
    pin NUMERIC(4) -- 4-digit card PIN number
);
