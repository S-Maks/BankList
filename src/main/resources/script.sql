--drop table "user", account;
--drop table account,users;
create table users
(
    iduser  SERIAL primary key,
    name    VARCHAR(45) NOT NULL,
    surname VARCHAR(45) NOT NULL
);
create table account
(
    idaccount SERIAL PRIMARY KEY,
    account   int NOT NULL DEFAULT 0,
    iduser    INT,
    FOREIGN KEY (iduser) references users(iduser) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO public.users (name, surname)
VALUES ('Maks', 'Titok');
INSERT INTO public.users (name, surname)
VALUES ('Test', 'Test');
INSERT INTO public.account (account, iduser)
VALUES (100, 1);
INSERT INTO public.account (account, iduser)
VALUES (10, 2);
INSERT INTO public.account (account, iduser)
VALUES (150, 1);
INSERT INTO public.account (account, iduser)
VALUES (200, 1);
INSERT INTO public.account (account, iduser)
VALUES (250, 1);

SELECT Account.iduser
from Account
GROUP BY Account.iduser
ORDER BY sum(account) desc;

Select Account.iduser, sum(account.account)
FROM  Account
group by Account.iduser;

