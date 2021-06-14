-- -----------------------------------------------------
-- Schema todo-app
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `user`;

CREATE SCHEMA `user`;
USE `user` ;

-- -----------------------------------------------------
-- Table `todo-app`.`task`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `user`.`user` (
  `id` int auto_increment,
  `name` VARCHAR(255) DEFAULT NULL,
  `email` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) 
ENGINE=InnoDB;