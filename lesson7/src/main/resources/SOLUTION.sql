SELECT * FROM mark WHERE mark > 6 ORDER BY mark DESC;
SELECT * FROM payment WHERE amount < 300 ORDER BY amount;
SELECT * FROM paymenttype ORDER BY name;
SELECT * FROM student ORDER BY name DESC;
select distinct s.id, s.name, s.birthday, s.groupnumber from STUDENT AS s join PAYMENT p on s.ID = p.STUDENT_ID where AMOUNT > 1000 order by s.BIRTHDAY;









