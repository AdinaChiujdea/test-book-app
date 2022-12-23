create table `publishers`(
   `id` INT NOT NULL AUTO_INCREMENT,
   `name` VARCHAR(100) NOT NULL,
   `location` VARCHAR(40) NOT NULL,
   `telephone` VARCHAR(40) NOT NULL,
   `email` VARCHAR(50) NOT NULL,
   PRIMARY KEY ( `id` )
);
create table `books`(
   `id` INT NOT NULL AUTO_INCREMENT,
   `title` VARCHAR(100) NOT NULL,
   `isbn` VARCHAR(40) NOT NULL,
   `publisher_id` INT NOT NULL,
   PRIMARY KEY ( `id` ),
   CONSTRAINT `fk_publisher` FOREIGN KEY (`publisher_id`) REFERENCES `publishers` (`id`)
);


INSERT INTO publishers VALUES (1001, 'John Smith', 'BRASOV', '0123456789', 'test@email.com');
INSERT INTO publishers VALUES (1002, 'Popescu Ion', 'Bucuresti', '0123456789', 'test@email.com');
INSERT INTO publishers VALUES (1003, 'XE', 'BRASOV', '0123456789', 'test@email.com');
INSERT INTO publishers VALUES (1004, 'BT', 'BRASOV', '0123456789', 'test@email.com');
INSERT INTO publishers VALUES (1005, 'RFSD', 'BRASOV', '0123456789', 'test@email.com');

INSERT INTO books VALUES (1, 'Title', '12356448556', 1001);