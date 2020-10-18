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

COMMIT TRANSACTION;
        