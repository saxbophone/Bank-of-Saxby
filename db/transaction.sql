CREATE TABLE transaction (
    id SERIAL PRIMARY KEY, -- Auto-incrementing Primary Key
    initiator SERIAL NOT NULL REFERENCES account(id), -- Foreign Key to account table - the account that initiated this transaction
    participant SERIAL REFERENCES account(id), -- Foreign Key to account table - the other participating account in this transaction (the recipient if withdrawal, the sender if deposit). This field should be null if this is a cash deposit or withdrawal
    card SERIAL REFERENCES card(id) -- Foreign Key to card table - the card that this transaction was authorised under (could be NULL)
    cash_transaction BOOLEAN, -- is this a cash transaction? TRUE if yes, FALSE if no.
    amount NUMERIC(15, 2) CONSTRAINT non_zero_amount CHECK(@amount > 0.00), -- value of transaction - positive values mean it's a deposit, negative mean it's a withdrawal. The @ operator in the CHECK clause is a Postgres Operator for getting absolute value of numeric.
    CONSTRAINT card_required_for_cash CHECK((card IS NOT NULL AND cash_transaction = TRUE) OR (card IS NOT NULL AND cash_transaction = FALSE) OR (card IS NULL AND cash_transaction = FALSE)), -- constraint only allows cash transactions to happen if card is present. The OR conjunctions ensure that a card can be present with transfers but is not required.
    CONSTRAINT cash_transactions_allowed CHECK((initiator.allow_cash AND cash_transaction) OR (cash_transaction = FALSE)) -- constraint that only allows cash transactions if allowed for this account, ignoring this if it's not a cash transaction.
);
