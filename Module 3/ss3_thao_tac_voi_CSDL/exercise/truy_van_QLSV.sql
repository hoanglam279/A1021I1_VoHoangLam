select *
from student
where StudentName like 'H%';

select *
from class inner join
student on class.ClassID=student.ClassId
where month(class.StartDate)=12;

select * 
from subject
where Credit between 3 and 5;

update student
set classID =2
where studentName='Hung';

select student.StudentName,subject.SubName, mark.Mark
from student inner join
mark on student.StudentId=mark.StudentId inner join
`subject` on  mark.SubId= `subject`.SubID
order by mark desc, StudentName asc ;