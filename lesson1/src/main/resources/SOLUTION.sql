create table Student (id bigint AUTO_INCREMENT primary key,name varchar,birthday date,"group" int);
create table Subject (id bigint AUTO_INCREMENT primary key,name varchar,description varchar,grade int);
create table PaymentType (id bigint AUTO_INCREMENT primary key,name varchar);
create table Payment (id bigint AUTO_INCREMENT primary key,type_id bigint references PaymentType(id),amount decimal,student_id bigint references Student(id),payment_date timestamp);
create table Mark (id bigint AUTO_INCREMENT primary key,student_id bigint references Student(id),subject_id bigint references Subject(id),mark int);