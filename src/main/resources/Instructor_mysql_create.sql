CREATE TABLE `instructor` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`name` TEXT(45) NOT NULL,
	`age` TEXT(45) NOT NULL,
	`instructor_detail_id` INT NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `instructor_detail` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`youtubechannel` VARCHAR(100),
	`hobby` VARCHAR(100),
	PRIMARY KEY (`id`)
);

ALTER TABLE `instructor` ADD CONSTRAINT `instructor_fk0` FOREIGN KEY (`instructor_detail_id`) REFERENCES `instructor_detail`(`id`);

