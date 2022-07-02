-- login table
drop table IF EXISTS users;

CREATE TABLE users (
    email varchar2(30) primary key,
    nickname varchar2(20) not null,
    password varchar2(20) not null,
--     추후 소속을 나눌 예정
    part number(3),
--     admin 여부 기본 값 1, admin 25 예정
    admin number(2) default 1
);