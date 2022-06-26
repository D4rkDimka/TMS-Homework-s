package database;

public class Main {
    public static void main(String[] args) {
    /*
    //Создание таблиц + добавление в них данных

create table if not exists person_data(
    person_id serial PRIMARY KEY,
    person_name character varying(30),
    person_sex character varying(10),
    person_birthday date
);

create table if not exists hobby_type(
    hobby_type_name character varying(20) PRIMARY KEY
);


create table if not exists hobby(
    hobby_id serial PRIMARY KEY,
    hobby_name character varying(20),
    hobby_type character varying(20),
    user_id int,
    FOREIGN KEY (hobby_type) references hobby_type(hobby_type_name) ON DELETE CASCADE
    FOREIGN KEY (user_id) references person_data(person_id) ON DELETE CASCADE
);


create table if not exists person_hobby(
    person_id int,
    person_hobby int,
    FOREIGN KEY (person_id) references person_data(person_id) ON DELETE CASCADE ,
    FOREIGN KEY (person_hobby) references hobby(hobby_id)ON DELETE CASCADE
);

insert into person_data(person_name, person_sex, person_birthday)
VALUES (...Потерял значение)



insert into hobby_type(hobby_type_name)
VALUES ('active'),
       ('passive');


insert into hobby(hobby_name, hobby_type,user_id)
VALUES ('Hockey','active',1),
       ('Football','active',1),
       ('Chess','passive',2),
       ('Chess','passive',3),
       ('Chess','passive',5),
       ('Chess','passive',7),
       ('Video games','passive',8),
       ('Collecting','passive',10),
       ('GYM','active',4);

//Удаление всех таблиц
drop table person_data,hobby,hobby_type,person_hobby;

//Вывести всех людей старше какого-либо возраста

select person_name,person_birthday
from person_data
where (person_birthday > ('2000-10-10'))
order by person_name

//Вывести сколько людей каждого пола есть в бд

select person_sex,
sum (case when person_sex = 'male' then 1 else 0 end) as male,
sum(case when person_sex = 'female' then 1 else 0 end) as female
from person_data
group by person_sex

//Вывести информацию о людях и их хобби
select hobby_name,hobby_type,person_name
from hobby,person_data
where person_id = hobby.user_id

// Вывести список людей у которых более одного хобби(не смог сделать!)


//Вывести список людей у которых только пассивные хобби (*)
select person_name
from person_data
inner join hobby h on person_data.person_id = h.user_id
where(hobby_type = 'passive')
order by person_name;

//Вывести какое количество активных хобби и пассивных хобби есть в бд
select
       count(hobby_type) filter ( where hobby_type = 'passive') as passive,
       count(hobby_type) filter (where hobby_type = 'active') as active
from hobby

//Вывести информацию какое хобби активное а какое пассивное
select hobby_type AS Type,hobby_name As NAME
from hobby
where hobby_type = 'passive' or hobby_type = 'active'
group by hobby_type, hobby_name; //Не понял, как можно разделить на два столбца

    */
    }
}
