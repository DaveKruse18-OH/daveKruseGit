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

COMMIT TRANSACTION;
        