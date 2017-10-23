DROP DATABASE IF EXISTS mmsdb;

CREATE DATABASE IF NOT EXISTS `mmsdb`

  DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;

USE mmsdb;

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS user
(
  id        INT AUTO_INCREMENT
    PRIMARY KEY,
  enabled   TINYINT      NULL,
  `account_non_locked` TINYINT      NULL,
  `credential_non_expired` TINYINT      NULL,
  `account_non_expired` TINYINT      NULL,
  password  VARCHAR(255) NULL,
  email VARCHAR(255) NOT NULL,
  role      VARCHAR(255) NULL,
  CONSTRAINT `user_email_uindex`
  UNIQUE (email)
);
-- auto-generated definition
DROP TABLE IF EXISTS `user_address`;
CREATE TABLE IF NOT EXISTS `user_address`
(
  id            INT AUTO_INCREMENT
    PRIMARY KEY,
  house_number  VARCHAR(255) NULL,
  address_line1 VARCHAR(255) NULL,
  address_line2 VARCHAR(255) NULL,
  city          VARCHAR(255) NULL,
  county        VARCHAR(255) NULL,
  post_code     VARCHAR(255) NULL,
  country       VARCHAR(255) NULL
);

-- auto-generated definition
DROP TABLE IF EXISTS `user_profile`;
CREATE TABLE IF NOT EXISTS `user_profile`
(
  id        INT AUTO_INCREMENT
    PRIMARY KEY,
  username  VARCHAR(255) NOT NULL,
  firstname VARCHAR(255) NOT NULL,
  lastname  VARCHAR(255) NULL,
  user_id   INT          NULL,
  address_id INT NULL ,
  CONSTRAINT `user-profile_username_uindex`
  UNIQUE (username),
  KEY `user_profile_user_id_fk` (user_id),
  CONSTRAINT `user_profile_user_id_fk` FOREIGN KEY (user_id) REFERENCES user (id) ON DELETE CASCADE ON UPDATE CASCADE,
  KEY `user_address_address_id_fk` (address_id),
  CONSTRAINT `user_address_address_id_fk` FOREIGN KEY (address_id) REFERENCES user_address (id) ON DELETE CASCADE ON UPDATE CASCADE
);

-- auto-generated definition
DROP TABLE IF EXISTS user_album;
CREATE TABLE IF NOT EXISTS user_album
(
  id INT AUTO_INCREMENT
    PRIMARY KEY,
  profile_id INT NOT NULL,
  KEY `user_profile_profile_id_fk` (profile_id),
  CONSTRAINT `user_profile_profile_id_fk` FOREIGN KEY (profile_id) REFERENCES user_profile (id) ON DELETE CASCADE ON UPDATE CASCADE
);

-- auto-generated definition
DROP TABLE IF EXISTS user_image;
CREATE TABLE IF NOT EXISTS user_image
(
  id INT PRIMARY KEY AUTO_INCREMENT,
  hero_image TINYINT,
  image BLOB NOT NULL,
  caption VARCHAR(255),
  album_id INT NULL,
  KEY `user_album_album_id_fk` (album_id),
  CONSTRAINT `user_album_album_id_fk` FOREIGN KEY (album_id) REFERENCES user_album (id) ON DELETE CASCADE ON UPDATE CASCADE

);

INSERT INTO mmsdb.`user_address`  (id, house_number,address_line1, address_line2,city,county, post_code, country)
VALUES (NULL, 62, "Beckett Lane", "Langley Green", "Crawley", "West Sussex","RH11 7SN", "UK");

INSERT INTO mmsdb.`user_address` (id, house_number,address_line1, address_line2,city,county, post_code, country)
VALUES (NULL, 74, "Sunny Mead", "West Green", "Crawley", "West Sussex","RH11 7DZ", "UK");

INSERT INTO mmsdb.user (email, enabled, `account_non_expired`, `credential_non_expired`,`account_non_locked`, password, role)
VALUES ('olatunji.nofiu@ymail.com', 1, 1, 1,1, 'olataju20', 'USER');

INSERT INTO mmsdb.`user_profile` (username, firstname, lastname, user_id, address_id)
  VALUE ('olatno', 'olatunji', 'nofiu', 1, 1);