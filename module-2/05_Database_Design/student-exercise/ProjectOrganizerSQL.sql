drop table employee_project;
drop table employee;
drop table department;
drop table project;


BEGIN TRANSACTION;

CREATE TABLE department
(
        departmentNumber serial,
        departmentName varchar(50) not null,
        
        constraint pk_department primary key (departmentNumber)
        
);

CREATE TABLE project
(
        projectNumber serial,
        name varchar(100) not null,
        startDate date,
        
        constraint pk_project primary key (projectNumber)
        
);

CREATE TABLE employee
(
        employeeId serial,
        jobTitle varchar(25),
        lastName varchar(64) not null,
        firstName varchar(64) not null,
        gender char(1) not null,
        dateOfBirth date,
        dateOfHire date,
        departmentNumber int not null,
        
        constraint pk_employee primary key (employeeId),
        constraint fk_employee_department foreign key (departmentNumber) references department (departmentNumber)
);

CREATE TABLE employee_project
(
        employeeId int not null,
        projectNumber int not null,
        
        constraint pk_employee_project primary key (employeeId, projectNumber),
        constraint fk_employee_project_employee foreign key (employeeId) references employee (employeeId),
        constraint fk_employee_project_project foreign key (projectNumber) references project (projectNumber)
        
);

insert into project (name, startDate) values ('project1Name', '2020-10-19');
insert into project (name, startDate) values ('project2Name', '2020-10-19');
insert into project (name, startDate) values ('project3Name', '2020-10-20');
insert into project (name, startDate) values ('project4Name', '2020-12-18');

insert into department (departmentName) values ('Accounting');
insert into department (departmentName) values ('Engineering');
insert into department (departmentName) values ('Human Resources');

insert into employee (jobTitle, lastName, firstName, gender, dateOfBirth, dateOfHire, departmentNumber) values ('Mechanical Engineer', 'Kruse', 'Marissa', 'F', '1997-10-30', '2019-03-02', 2);
insert into employee (jobTitle, lastName, firstName, gender, dateOfBirth, dateOfHire, departmentNumber) values ('Software Engineer', 'Kruse', 'David', 'M', '1985-10-18', '2015-07-18', 2);
insert into employee (jobTitle, lastName, firstName, gender, dateOfBirth, dateOfHire, departmentNumber) values ('Director', 'Smith', 'Sam', 'M', '1998-11-30', '2017-05-03', 3);
insert into employee (jobTitle, lastName, firstName, gender, dateOfBirth, dateOfHire, departmentNumber) values ('Administrator', 'Yelic', 'Lisa', 'F', '1997-07-30', '2015-12-02', 3);
insert into employee (jobTitle, lastName, firstName, gender, dateOfBirth, dateOfHire, departmentNumber) values ('Accountant', 'Doe', 'John', 'M', '1995-06-30', '2017-07-15', 1);
insert into employee (jobTitle, lastName, firstName, gender, dateOfBirth, dateOfHire, departmentNumber) values ('Manager', 'Charles', 'Don', 'M', '1995-03-02', '2018-05-13', 1);

insert into employee_project (employeeId, projectNumber) values (1, 1);
insert into employee_project (employeeId, projectNumber) values (6, 1);
insert into employee_project (employeeId, projectNumber) values (2, 2);
insert into employee_project (employeeId, projectNumber) values (5, 2);
insert into employee_project (employeeId, projectNumber) values (3, 3);
insert into employee_project (employeeId, projectNumber) values (4, 3);
insert into employee_project (employeeId, projectNumber) values (2, 4);
insert into employee_project (employeeId, projectNumber) values (3, 4);

COMMIT TRANSACTION;
        