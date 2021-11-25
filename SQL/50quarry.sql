select * from dept ;

select ename,job,hiredate,empno from emp;

select ename ,job ,sal as "montlysal" ,sal*12 as "annual sal" from emp;

select  ename +','+ ' '+ job "employee and title" from emp;

select distinct job from emp;

select ename,sal from emp where sal>2850;

select emp.ename,dept.DEPTNO from emp,dept where ename='smith';

select emp.ename,emp.job from emp where HIREDATE between'1981-02-20' and '1981-05-01';

SELECT emp.ENAME,dept.DEPTNO FROM EMP,DEPT where (dept.DEPTNO=10 OR dept.DEPTNO=30) ORDER BY(ENAME);

SELECT emp.ENAME,emp.HIREDATE FROM EMP where year(hiredate)='1982';

SELECT ENAME,JOB FROM EMP where MGR IS NULL;


