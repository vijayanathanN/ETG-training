SELECT*FROM Worker_Details

SELECT*FROM Bonus

SELECT*FROM Title

/*1.	List of employees who are consultants along with their department.*/

SELECT w.WORKER_ID, w.FIRST_NAME+' '+LAST_NAME as 'Fullname',w.DEPARTMENT,t.WORKER_TITLE
FROM WORKER_DETAILS w,TITLE t
WHERE w.WORKER_ID = t.WORKER_REF_ID 
AND WORKER_TITLE LIKE 'Consultant';

/*Display the name of employees having the highest salary in each department.*/

SELECT
first_name,salary,department
FROM Worker_Details
WHERE(SALARY)in(SELECT
max(salary)as 'highest salary'
FROM Worker_Details
GROUP BY DEPARTMENT);

