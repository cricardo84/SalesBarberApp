-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema chopchop_db
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema chopchop_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `chopchop_db` DEFAULT CHARACTER SET utf8 ;
USE `chopchop_db` ;

-- -----------------------------------------------------
-- Table `chopchop_db`.`Employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `chopchop_db`.`Employee` (
  `idEmployee` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `lastName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEmployee`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `chopchop_db`.`User`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `chopchop_db`.`User` (
  `idUser` INT NOT NULL AUTO_INCREMENT,
  `userName` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `lastLogin` VARCHAR(45) NULL,
  `idEmployee` INT NOT NULL,
  PRIMARY KEY (`idUser`),
  INDEX `idEmployee_idx` (`idEmployee` ASC) VISIBLE,
  CONSTRAINT `idEmployee`
    FOREIGN KEY (`idEmployee`)
    REFERENCES `chopchop_db`.`Employee` (`idEmployee`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
