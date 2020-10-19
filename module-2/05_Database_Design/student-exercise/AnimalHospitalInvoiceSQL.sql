drop table ProcedureType;
drop table Pet;
drop table PetProcedure;
drop table PetOwner;
drop table Address;
drop table Invoice;
drop table Hospital;

BEGIN TRANSACTION;

CREATE TABLE Address
(
        addressId serial,
        street varchar(50) not null,
        city varchar(50) not null,
        state varchar(10) not null,
        zip varchar(10),
        
        constraint pk_Address primary key (addressId)
        
);

CREATE TABLE Hospital
(
        hospitalId serial,
        name varchar(50) not null,
        
        constraint pk_Hsopital primary key (hospitalId)
        
);

create table PetOwner
(
        ownerId serial,
        firstName varchar(15) not null,
        lastName varchar(25) not null,
        addressId int not null,
        hospitalId int not null,
        
        constraint pk_PetOwner primary key (ownerId),
        constraint fk_PetOwner_Hospital foreign key (hospitalId) references Hospital (hospitalId),
        constraint fk_PetOwner_Address foreign key (addressId) references Address (addressId)
        
);

CREATE TABLE Invoice
(
        invoiceId serial,
        invoiceDate date not null,
        hospitalId int not null,
        
        constraint pk_Inovoice primary key (invoiceId),
        constraint fk_Invoice_Hospital foreign key (hospitalId) references Hospital (hospitalId)

);

CREATE TABLE Pet
(
        petId serial,
        petName varchar(25) not null,
        ownerId int not null,
        
        constraint pk_Pet primary key (petId),
        constraint fk_Pet_PetOwner foreign key (ownerId) references PetOwner (ownerId)

);

create table ProcedureType
(
        procedureTypeId serial,
        procedureType varchar(50) not null,
        procedureCost varchar(10) not null,
        
        constraint pk_ProcedureType primary key (procedureTypeId)
        
);

create table PetProcedure
(
        petProcedureId serial,
        description varchar(50) not null,
        procedureDate date not null,
        procedureTypeId int not null,
        petId int not null,
        
        constraint pk_PetProcedure primary key (petProcedureId),
        constraint fk_PetProcedure_ProcedureType foreign key (procedureTypeId) references ProcedureType (procedureTypeId),
        constraint fk_PetProcedure_Pet foreign key (petId) references Pet (petId)
);

COMMIT TRANSACTION;
