-- springBoot db insertions
--insert into COURSE (ID, AUTHOR, NAME)
--values (100001, 'Learning course', 'Learn Microservices');

--insert into COURSE (ID, AUTHOR, NAME)
--values (100002, 'Learning course', 'Learn FullStack with React');

--insert into COURSE (ID, AUTHOR, NAME)
--values (100003, 'Learning course', 'Learn AWS');

-- restful db insertions
insert into user_details(id, birth_date, name)
values (10001, current_date(), 'Ranga');

insert into user_details(id, birth_date, name)
values (10002, current_date(), 'Ravi');

insert into user_details(id, birth_date, name)
values (10003, current_date(), 'Adam');

insert into user_details(id, birth_date, name)
values (10004, current_date(), 'Eve');

insert into post(id, description, user_id)
values(20001, 'I want to learn AWS', 10001);

insert into post(id, description, user_id)
values(20002, 'I want to learn React', 10002);

insert into post(id, description, user_id)
values(20003, 'I want to learn JavaScript', 10002);

insert into post(id, description, user_id)
values(20004, 'I want to learn nothing', 10003);