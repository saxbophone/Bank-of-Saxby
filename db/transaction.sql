CREATE TABLE transaction (
    id SERIAL PRIMARY KEY, -- Auto-incrementing Primary Key
    initiator SERIAL NOT NULL REFERENCES account(id), -- Foreign Key to account table - the account that initiated this transaction
    participant SERIAL REFERENCES account(id), -- Foreign Key to account table - the other participating account in this transaction (the recipient if withdrawal, the sender if deposit). This field should be null if this is a cash deposit or withdrawal
    card SERIAL REFERENCES card(id) -- Foreign Key to card table - the card that this transaction was authorised under (could be NULL)
    transfer BOOLEAN, -- type of transaction - TRUE for Transfer involving another account, FALSE for Cash Deposit or Withdrawal
    amount NUMERIC(15, 2) CHECK(@amount > 0.00) -- value of transaction - positive values mean it's a deposit, negative mean it's a withdrawal. The @ operator in the CHECK clause is a Postgres Operator for getting absolute value of numeric.
);
