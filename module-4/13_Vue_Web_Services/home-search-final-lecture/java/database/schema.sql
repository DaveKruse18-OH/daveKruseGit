BEGIN TRANSACTION;

DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS seq_user_id;
DROP TABLE IF EXISTS home;

CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;


CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id'::regclass) NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE home 
(
   id serial,
   mlsNumber varchar(32) not null,
   address varchar(64) not null,
   city varchar(50) not null,
   state varchar(50) not null,
   zip varchar(10) not null,
   price numeric(12,2) not null,
   imageName varchar(50),
   
   constraint pk_home primary key (id)
   
 );

INSERT INTO home (mlsNumber, address, city, state, zip, price, imageName) VALUES ('1000', '123 Java Green Lane', 'Columbus', 'Ohio', '43023', '1222345.00', '1000.jpg'); 
INSERT INTO home (mlsNumber, address, city, state, zip, price, imageName) VALUES ('1001', '123 Vue Street', 'Grandview', 'Ohio', '43015', '400250.99', '1001.jpg');
INSERT INTO home (mlsNumber, address, city, state, zip, price, imageName) VALUES ('1002', '5555 Java Blue Ct.', 'Columbus', 'Ohio', '43023', '450000.00', '1002.jpg');
INSERT INTO home (mlsNumber, address, city, state, zip, price, imageName) VALUES ('1003', '99 C-Sharp Road', 'Dublin', 'Ohio', '43017', '345.00', '1003.jpg');
INSERT INTO home (mlsNumber, address, city, state, zip, price, imageName) VALUES ('1004', '175 Cohort Lane', 'Pickerington', 'Ohio', '43065', '400000.01', '1004.jpg');


INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');


COMMIT TRANSACTION;
