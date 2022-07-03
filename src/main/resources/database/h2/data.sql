-- login table
drop table IF EXISTS users, board;
drop sequence IF EXISTS BOARD_SEQ;

CREATE TABLE users (
    email varchar2(30) primary key,
    nickname varchar2(20) not null,
    password varchar2(20) not null,
    part number(3),
    admin number(2) default 1
);


CREATE TABLE board (
    boardNum number(8) primary key,
    userId varchar2(20),
    wDate date default LOCALTIMESTAMP(0),
    title varchar2(50),
    content varchar2(100),
    hitNum number(7) default 0
);

CREATE SEQUENCE BOARD_SEQ
    INCREMENT BY 1
    START WITH 1
    MINVALUE 1
    MAXVALUE 99999
    NOCYCLE
    NOCACHE
;