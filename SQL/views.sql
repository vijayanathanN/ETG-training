CREATE VIEW 	empvu80
 AS SELECT  empno, Ename, sal
    FROM    emp
    WHERE   DEPTNO = 80;

CREATE VIEW salvu50

AS SELECT  empno, Ename NAME,
            sal*12 ANN_SALARY
    FROM    emp
    WHERE   deptno = 10;

	select*
	From salvu50;

 alter VIEW empvu80
  (empno, ename, sal, deptno)
AS SELECT  empno, ename, 
           sal, deptno
   FROM    emp
   WHERE   deptno = 30;
