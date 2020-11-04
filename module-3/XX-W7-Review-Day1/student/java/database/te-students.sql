DROP TABLE IF EXISTS student;
DROP TABLE IF EXISTS course;


-- DO NOT USE THIS AS AN EXAMPLE. THIS IS NOT A NORMALIZED TABLE
-- CONTACT INFO SHOULD BE IN A SEPARATE TABLE, THERE SHOULD BE A JOIN TABLE BETWEEN STUDENT and COURSE

CREATE TABLE student (
	id serial,
	first_name varchar(20) NOT NULL,
	last_name varchar(30) NOT NULL,
	section varchar(50) NOT NULL,
    cohort varchar(50) NOT NULL,
    phone varchar(50) NOT NULL,
    email varchar(50) NOT NULL,
	CONSTRAINT pk_student_id PRIMARY KEY (id)
);

CREATE TABLE course (
	id serial,
	course_name varchar(200) NOT NULL,
	description varchar(300) NOT NULL,
	CONSTRAINT pk_course_id PRIMARY KEY (id)
);

INSERT INTO student (id, first_name, last_name, section, cohort, phone, email)
VALUES (1, 'Gerard', 'Clayton', 'Java Green', '11', '555-555-5555', 'gerard@te.com');

INSERT INTO student (id, first_name, last_name, section, cohort, phone, email)
VALUES (2, 'Julie', 'Burt', 'Java Green', '11', '111-222-3333', 'julie@te.com');

INSERT INTO student (id, first_name, last_name, section, cohort, phone, email)
VALUES (3, 'Kameron', 'Peters', 'Java Green', '11', '333-333-3333', 'kameron@te.com');

INSERT INTO student (id, first_name, last_name, section, cohort, phone, email)
VALUES (4, 'Izzie', 'Weiss', 'Java Green', '11', '444-444-4444', 'izzie@te.com');

INSERT INTO student (id, first_name, last_name, section, cohort, phone, email)
VALUES (5, 'Jagoda', 'Connolly', 'Java Green', '11', '777-777-7777', 'jagoda@te.com');

INSERT INTO student (id, first_name, last_name, section, cohort, phone, email)
VALUES (6, 'Keira', 'porter', 'Java Green', '11', '345-123-4555', 'keira@te.com');

INSERT INTO course (id, course_name, description) 
VALUES (1, 'Introduction to Java', 'This class teaches you the basics of Java. Perfect for new programmers or people who have been away from Java for some time.');

INSERT INTO course (id, course_name, description) 
VALUES (2, 'Office Politics 101', 'This class teaches you the basics of office politics and how to position yourself in front of your fellow minions.');

INSERT INTO course (id, course_name, description) 
VALUES (3, 'Office Politics 201', 'This class teaches you how to look busy, yet still be able to slack off at work and spread office rumors.');

INSERT INTO course (id, course_name, description) 
VALUES (4, 'Introduction to C#', 'This class teaches you how to code in C#, a nice version of Java, with a slightly better IDE.');

INSERT INTO course (id, course_name, description) 
VALUES (5, 'How To Bribe Your Tech Lead', 'This class teaches you how to get more help out of your tech lead.');

INSERT INTO course (id, course_name, description) 
VALUES (6, 'How To Be An Effective Tech Lead', 'This class teaches you how to look so busy that your developers will not bother you so you can read Internet articles about the latest technical buzzwords');

INSERT INTO course (id, course_name, description) 
VALUES (7, 'How To Use The Debugger', 'Just kidding. No one has time for that!');

ALTER SEQUENCE student_id_seq RESTART 1000;
ALTER SEQUENCE course_id_seq RESTART 1000;