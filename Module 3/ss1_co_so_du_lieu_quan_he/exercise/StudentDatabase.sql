use student_management;
create table class(
idStudent int not null,
nameStudent varchar(45) null,
primary key (idStudent)
);
create table teacher(
idTeacher int not null,
nameTeacher varchar(45) null,
ageTeacher int null,
countryTeacher varchar(45) null,
primary key (idTeacher)
);