use quanlysinhvien;

select * from student;

select * 
from student
where Status=true;

select * 
from `subject`
where Credit<10;

select s.StudentId,s.StudentName,c.ClassName
from student s join class c on s.ClassId=c.ClassID; 

select s.StudentId, s.StudentName, C.ClassName
from student s join class c on s.ClassId = c.ClassID
where c.ClassName = 'A1';

select S.StudentId, S.StudentName, Sub.SubName, M.Mark
from Student S join Mark M on S.StudentId = M.StudentId 
join Subject Sub on M.SubId = Sub.SubId;

select S.StudentId, S.StudentName, Sub.SubName, M.Mark
from Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId
where Sub.SubName = 'CF';