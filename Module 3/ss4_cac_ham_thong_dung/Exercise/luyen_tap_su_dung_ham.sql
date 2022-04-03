use quanlysinhvien;

select *
from `subject`
having max(Credit);

select * 
from `subject` inner join mark on `subject`.SubID=mark.SubId
having max(mark);

select *, avg(mark) as 'diem trung binh'
from student inner join mark on student.StudentId=mark.StudentId
group by student.StudentId
order by 'diem trung binh';