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


INSERT INTO publishers VALUES (1001, 'Tessa Bailey', 'Buzau', '0123456789', 'test@email.com');
INSERT INTO publishers VALUES (1002, 'Josie Silver', 'Bucuresti', '0123456780', 'test1@email.com');
INSERT INTO publishers VALUES (1003, 'Emily Stone', 'Maramures', '0123456782', 'test2@email.com');
INSERT INTO publishers VALUES (1004, 'Mandy Baggot', 'Sibiu', '0123456781', 'test3@email.com');
INSERT INTO publishers VALUES (1005, 'Josie Silver', 'Galati', '0123456786', 'test4@email.com');

INSERT INTO books VALUES (1, 'Window Shopping', '12356448556', 1001);
INSERT INTO books VALUES (2, 'O zi de Decembrie', '4343299328', 1002);
INSERT INTO books VALUES (3, 'Scrisoare de Craciun', '43435423328', 1003);
INSERT INTO books VALUES (4, 'One New York Christmas', '234566328', 1004);
INSERT INTO books VALUES (5, 'One day in december', '5369299328', 1005);
