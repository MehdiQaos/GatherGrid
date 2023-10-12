DROP DATABASE IF EXISTS gathergriddb;
CREATE DATABASE gathergriddb;

USE gathergriddb;
CREATE TABLE roles
(
            id        INT PRIMARY KEY AUTO_INCREMENT,
            role_name VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE users
(
            id                INT PRIMARY KEY AUTO_INCREMENT,
            username          VARCHAR(50)  NOT NULL UNIQUE,
            email             VARCHAR(100) NOT NULL UNIQUE,
            password          VARCHAR(255) NOT NULL,
            first_name        VARCHAR(50),
            last_name         VARCHAR(50),
            birthdate         DATE,
            role_id           INT,
            registration_date DATETIME DEFAULT CURRENT_TIMESTAMP,
            FOREIGN KEY (role_id) REFERENCES roles (id)
);

CREATE TABLE events
(
            id            INT PRIMARY KEY AUTO_INCREMENT,
            event_name    VARCHAR(100) NOT NULL,
            description   TEXT,
            event_date    DATE,
            location      VARCHAR(255),
            category_id   INT,
            organizer_id  INT,
            creation_date DATETIME DEFAULT CURRENT_TIMESTAMP,
            FOREIGN KEY (organizer_id) REFERENCES users (id),
            FOREIGN KEY (category_id) REFERENCES categories (id)
);

CREATE TABLE tickets
(
            id                 INT PRIMARY KEY AUTO_INCREMENT,
            event_id           INT,
            ticket_type        VARCHAR(50)    NOT NULL,
            price              DECIMAL(10, 2) NOT NULL,
            quantity_available INT            NOT NULL,
            sale_start_date    DATETIME,
            sale_end_date      DATETIME,
            FOREIGN KEY (event_id) REFERENCES events (id)
);

CREATE TABLE registrations
(
            id                INT PRIMARY KEY AUTO_INCREMENT,
            user_id           INT,
            event_id          INT,
            ticket_id         INT,
            registration_date DATETIME DEFAULT CURRENT_TIMESTAMP,
            FOREIGN KEY (user_id) REFERENCES users (id),
            FOREIGN KEY (event_id) REFERENCES events (id),
            FOREIGN KEY (ticket_id) REFERENCES tickets (id)
);

CREATE TABLE categories
(
            id            INT PRIMARY KEY AUTO_INCREMENT,
            category_name VARCHAR(50) NOT NULL,
            description   TEXT
);

CREATE TABLE reviews
(
            id          INT PRIMARY KEY AUTO_INCREMENT,
            user_id     INT,
            event_id    INT,
    --      rating ENUM('1', '2', '3', '4', '5') NOT NULL,
    --      rating INT CHECK (rating >= 1 AND rating <= 5) NOT NULL,
            rating      INT NOT NULL,
            review_text TEXT,
            review_date DATETIME DEFAULT CURRENT_TIMESTAMP,
            FOREIGN KEY (user_id) REFERENCES users (id),
            FOREIGN KEY (event_id) REFERENCES events (id)
);

CREATE TABLE images
(
            id          INT PRIMARY KEY AUTO_INCREMENT,
            user_id     INT,
            event_id    INT,
            image_type  ENUM ('profile', 'event', 'logo', 'other') NOT NULL,
            file_path   VARCHAR(255)                               NOT NULL,
            upload_date DATETIME DEFAULT CURRENT_TIMESTAMP,
            FOREIGN KEY (user_id) REFERENCES users (id),
            FOREIGN KEY (event_id) REFERENCES events (id)
);
