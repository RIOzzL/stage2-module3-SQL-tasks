SELECT * FROM Payment where amount >= 500;
SELECT * FROM Student WHERE DATEADD(YEAR , -20, CURRENT_DATE) > birthday;
SELECT * FROM Student WHERE "group" = 10 AND DATEADD(YEAR, -20, CURRENT_DATE) < birthday;
SELECT * FROM Student WHERE name LIKE 'Mike%' OR "group" IN (4, 5, 6);
SELECT * FROM Payment WHERE DATEADD(MONTH, -8, CURRENT_DATE) < payment_date;
SELECT * FROM Student WHERE name LIKE 'A%';
SELECT * FROM Student WHERE (name LIKE 'Roxi%' AND "group" = 4) OR (name LIKE 'Tallie%' AND "group" = 9);