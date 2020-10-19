drop table Invoice;
drop table Hospital;

BEGIN TRANSACTION;

CREATE TABLE Hospital
(
        hospitalId serial,
        name varchar(50) not null,
        
        constraint pk_Hsopital primary key (hospitalId)
        
);

CREATE TABLE Invoice
(
        invoiceId serial,
        invoiceDate date not null,
        hospitalId int not null,
        
        constraint pk_Inovoice primary key (invoiceId),
        constraint fk_Invoice_Hospital foreign key (hospitalId) references Hospital (hospitalId)

);

COMMIT TRANSACTION;
