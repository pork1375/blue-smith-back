-- login schema
INSERT INTO users (email, nickname, password, admin)
    values('n27kek@knou.ac.kr', 'rolling', '12341234', 25);

INSERT INTO board (boardNum, userId, title, content)
values(NEXT VALUE for BOARD_SEQ, 'JHK1', 'TITLE1', 'CONTENT1');

INSERT INTO board (boardNum, userId, title, content)
values(NEXT VALUE for BOARD_SEQ, 'JHK2', 'TITLE2', 'CONTENT2');

