CREATE TABLE "user" (
    userid SERIAL PRIMARY KEY,
    name VARCHAR (45) NOT NULL,
    sureName VARCHAR (45) NOT NULL
);
CREATE TABLE account(
  accountId SERIAL PRIMARY KEY,
  account INT NOT NULL DEFAULT (0),
  userid INT NOT NULL,
  FOREIGN KEY (userid) references "user" ON DELETE CASCADE ON UPDATE CASCADE

);

INSERT INTO "user" (name, sureName) VALUES ('Maks','Titok');
INSERT INTO "user" (name, sureName) VALUES ('Test','Test');
INSERT INTO account (account, userid) VALUES (100,1);
INSERT INTO account (account, userid) VALUES (10,2);

--drop table "user", account;