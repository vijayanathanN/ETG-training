SELECT EMPNO ,ename, hiredate as 'STARTDATE'
FROM EMP
UNION 
SELECT jobhist.EMPNO,emp.ename, STARTDATE
FROM JOBHIST,emp
WHERE ENDDATE IS NOT NULL and emp.empno=jobhist.empno
ORDER BY STARTDATE desc;



select emp.ENAME,jobhist.job
from emp,jobhist
where jobhist.job  like 'salesman'
and emp.EMPNO=jobhist.empno;

SELECT EMPNO,JOB
FROM EMP
WHERE JOB like 'SALES%'
UNION
SELECT EMPNO,JOB
FROM JOBHIST
WHERE JOB like 'SALES%'

select emp.ENAME,emp.DEPTNO,DEPT.DNAME
from emp,DEPT
except 
select emp.ENAME,dept.DEPTNO,DEPT.DNAME
from emp,DEPT
where emp.DEPTNO=DEPT.DEPTNO;

select e.ename,e.empno,d.deptno,d.dname
from dept d
full outer join
emp e
on(d.deptno=e.deptno)
where d.deptno in (select d.deptno
FROM dept d
UNION
SELECT e.deptno
FROM emp e)