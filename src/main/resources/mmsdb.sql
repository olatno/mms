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
  role      VARCHAR(255) NULL
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
  CONSTRAINT `user-profile_username_uindex`
  UNIQUE (username),
  KEY `user-profile_user_id_fk` (user_id),
  CONSTRAINT `user-profile_user_id_fk` FOREIGN KEY (user_id) REFERENCES user (id) ON DELETE CASCADE ON UPDATE CASCADE
);


INSERT INTO mmsdb.user (email, enabled, `account_non_expired`, `credential_non_expired`,`account_non_locked`, password, role)
VALUES ('olatunji.nofiu@ymail.com', 1, 1, 1,1, 'olataju20', 'USER');

INSERT INTO mmsdb.`user_profile` (username, firstname, lastname, user_id)
  VALUE ('olatno', 'olatunji', 'nofiu', 1);