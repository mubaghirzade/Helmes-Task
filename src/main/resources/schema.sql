CREATE TABLE
    sector(
        id INT NOT NULL PRIMARY KEY,
        value VARCHAR(50) NOT NULL,
        parent_id INT,
        margin INT,

        CONSTRAINT fk_sector_to_sector FOREIGN KEY (parent_id) REFERENCES sector(id)
);

CREATE TABLE
    request(
        id IDENTITY NOT NULL PRIMARY KEY,
        session VARCHAR(32) NOT NULL,
        name VARCHAR(100) NOT NULL,
        agreement BOOLEAN NOT NULL
);

CREATE TABLE
    request_sector(
        id IDENTITY NOT NULL PRIMARY KEY,
        request_id BIGINT NOT NULL,
        sector_id INT NOT NULL,

        CONSTRAINT req_sector_to_request FOREIGN KEY (request_id) REFERENCES request(id),
        CONSTRAINT req_sector_to_sector FOREIGN KEY (sector_id) REFERENCES sector(id)
);