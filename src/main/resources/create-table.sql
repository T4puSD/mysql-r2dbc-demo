-- separately create this table in the db first. with this script
-- reactive r2dbc don't have jpa entity annotations and auto table creating
create table event
(
    id         bigint unsigned not null primary key auto_increment,
    event_name varchar(20)     not null,
    message    varchar(200)    not null
);