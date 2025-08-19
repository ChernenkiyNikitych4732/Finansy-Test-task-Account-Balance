CREATE TABLE IF NOT EXISTS users
(
    id         BIGSERIAL PRIMARY KEY,
    username   VARCHAR(50) UNIQUE NOT NULL,
    first_name VARCHAR(100),
    last_name  VARCHAR(100),
    email      VARCHAR(150) UNIQUE NOT NULL,
    password   VARCHAR(255) NOT NULL,
    phone      VARCHAR(20),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE IF NOT EXISTS currencies
(
    id          BIGSERIAL PRIMARY KEY,
    code        VARCHAR(3) UNIQUE NOT NULL,
    name        VARCHAR(50) NOT NULL,
    symbol      VARCHAR(5) NOT NULL
);


CREATE TABLE IF NOT EXISTS accounts
(
    id          BIGSERIAL PRIMARY KEY,
    user_id     BIGINT REFERENCES users(id) ON DELETE CASCADE,
    currency_id BIGINT REFERENCES currencies(id),  -- Изменен на BIGINT
    balance     DECIMAL(15, 2) DEFAULT 0.00,
    account_type VARCHAR(50) NOT NULL,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE IF NOT EXISTS transaction_types
(
    id          BIGSERIAL PRIMARY KEY,
    code        VARCHAR(50) UNIQUE NOT NULL,
    description TEXT
);


CREATE TABLE IF NOT EXISTS transactions
(
    id                BIGSERIAL PRIMARY KEY,
    account_id        BIGINT REFERENCES accounts(id) ON DELETE CASCADE,
    amount            DECIMAL(15, 2) NOT NULL,
    transaction_type  BIGINT REFERENCES transaction_types(id) ON DELETE CASCADE,
    transaction_date  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    description       TEXT
);


CREATE TABLE IF NOT EXISTS balance_entities
(
    id              BIGSERIAL PRIMARY KEY,
    account_id      BIGINT REFERENCES accounts(id) ON DELETE CASCADE,
    amount_change   DECIMAL(15, 2) NOT NULL,
    balance_after   DECIMAL(15, 2) NOT NULL,
    change_date     TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    description     TEXT
);
