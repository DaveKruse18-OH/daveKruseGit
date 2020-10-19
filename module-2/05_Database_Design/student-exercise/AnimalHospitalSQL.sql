drop table PetProcedure;
drop table ProcedureToPerform;
drop table Pet;
drop table PetType;
drop table PetOwner;
drop table AnimalHospital;

BEGIN TRANSACTION;

CREATE TABLE AnimalHospital
(
        hospitalId serial,
        
        constraint pk_AnimalHospital primary key (hospitalId)
);

CREATE TABLE PetOwner
(
        ownerId serial,
        firstName varchar(50) not null,
        lastName varchar(50) not null,
        hospitalId int not null,
        
        constraint pk_PetOwner primary key (ownerId),
        constraint fk_PetOwner_AnimalHospital foreign key (hospitalId) references AnimalHospital (hospitalId)

);

CREATE TABLE PetType
(
        petTypeId serial,
        prtType varchar(50),
        
        constraint pk_PetType primary key (petTypeId)
        --constraint fk_PetType_Pet foreign key (petTypeId) references PetType (petTypeId)
);

CREATE TABLE Pet
(
        petId serial,
        petName varchar(50) not null,
        age int,
        ownerId int not null,
        petTypeId int not null,
        
        constraint pk_Pet primary key (petId),
        constraint fk_Pet_PetOwner foreign key (ownerId) references PetOwner (ownerId),
        constraint fk_Pet_PetType foreign key (petTypeId) references PetType (petTypeId)
);

CREATE TABLE ProcedureToPerform
(
        procedureId serial,
        procedureDate date,
        description varchar(100) not null,
        hospitalId int not null,

        constraint pk_ProcedureToPerform primary key (procedureId),
        constraint fk_ProcedureToPerform_AnimalHospital foreign key (hospitalId) references AnimalHospital (hospitalId)
        --constraint fk_ProcedureToPerform_PetProcedure foreign key (procedureId) references PetProcedure (procedureId)

);

CREATE TABLE PetProcedure
(
        petId int not null,
        procedureId int not null,
        
        constraint pk_PetProcedure primary key (petId, procedureId),
        constraint fk_PetProcedure_ProcedureToPerform foreign key (procedureId) references ProcedureToPerform (procedureId),
        constraint fk_PetProcedure_Pet foreign key (petId) references Pet (petId)
        
);

COMMIT TRANSACTION;
