CREATE TABLE trips(
    id DEFAULT RANDOM_UUID() PRIMARY KEY,
    destination VARCHAR(255) NOT NULL,
    starts_at TIMESTAMP NOT NULL,
    ends_at TIMESTAMP NOT NULL,
    is_confirmed BOOLEAN NOT NULL,
    ownder_name VARCHAR(255) NOT NULL,
    owner_email VARCHAR(255) NOT NULL
);