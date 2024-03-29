## Exemples de requêtes


```
SHOW databases;

USE test_bdd;

SHOW TABLES;
```

#### Where :
```sql
SELECT *
FROM users;

SELECT first_name, last_name, job
FROM users;

SELECT * 
FROM users
WHERE job != 'Developer';

SELECT * 
FROM USERS 
WHERE first_name = 'John';

SELECT * 
FROM users 
WHERE salary >= 3000;
```

#### OR & AND
```sql
SELECT *
FROM users 
WHERE age < 30 OR age >= 35;

SELECT *
FROM users 
WHERE job = 'teacher' AND salary > 2600;
```
#### NOT
```sql
SELECT *
FROM users
WHERE NOT birth_location = 'New York';
```

#### ()
```sql
SELECT *
FROM users
WHERE birth_location = 'New York' AND (job = 'Teacher' OR job = 'Developer');
```
#### DISTINCT
```sql
SELECT DISTINCT job
FROM users
WHERE birth_location = 'New York';
```

```sql
SELECT DISTINCT first_name, last_name, job, birth_location
FROM users
WHERE birth_location IN ('Paris', 'London');

```

```sql
SELECT DISTINCT first_name, last_name, job, birth_location
FROM users
WHERE NOT birth_location IN ('Paris', 'London');
```

```sql
SELECT DISTINCT first_name, last_name, job, birth_location
FROM users
WHERE age BETWEEN 30 AND 35;
```

```sql
SELECT DISTINCT first_name, last_name, job, birth_location
FROM users
WHERE age NOT BETWEEN 30 AND 35;
```

#### IN & BETWEEN

```sql
SELECT first_name, last_name, birth_location
FROM users
WHERE birth_location IN ('London', 'Paris', 'Berlin');

SELECT *
FROM users
WHERE age BETWEEN 25 AND 35;
```

#### ORDER BY

```sql
SELECT * 
FROM users
WHERE age > 30
ORDER BY salary ASC;

SELECT * 
FROM users
ORDER BY last_name DESC, age ASC;
```

#### LIMIT 
```sql
SELECT *
FROM users
ORDER BY salary DESC
LIMIT 5;
```

#### OFFSET
```sql
SELECT *
FROM users
ORDER BY salary DESC
LIMIT 5 OFFSET 3;
```  

```sql
SELECT * 
FROM users
ORDER BY age DESC
LIMIT 5;

SELECT * 
FROM users
ORDER BY first_name ASC
LIMIT 5 OFFSET 5;

SELECT *
FROM users
ORDER BY salary DESC
LIMIT 3;
```

```sql
SELECT MAX(age) FROM users;

SELECT MIN(age) AS developer_min_age
FROM users
WHERE job = 'Developer';

SELECT MAX(last_name) as last_name
FROM users;

SELECT COUNT(*) AS total_users
FROM users

SELECT AVG(salary) AS avg_salary_without_devs
FROM users
WHERE job != 'Developer';
```

```sql
SELECT MIN(salary) AS lowest_salary
FROM users;

SELECT MAX(age) AS oldest
FROM users
WHERE job = 'Engineer';

SELECT ROUND(AVG(salary), 0) AS average_salary
FROM users
WHERE job = 'Teacher';

SELECT SUM(salary) AS total_salary 	
FROM users;
```

#### GROUP BY

```sql
SELECT birth_location, SUM(salary)
FROM users
GROUP BY birth_location

SELECT birth_location, AVG(salary)
FROM users
GROUP BY birth_location
ORDER BY AVG(salary) DESC
```

#### HAVING

```sql
SELECT birth_location, AVG(salary) AS average_salary
FROM users
GROUP BY birth_location
HAVING AVG(salary) > 3000;
```

Il faut appliquer le filtre avant de grouper.
HAVING sans GROUP BY n'a pas de sens

#### LIKE

```sql
SELECT *
FROM users
WHERE birth_location LIKE 'P%';
```

% = N'importe quelle séquence, y compris sans aucune.  
_ = Représente exactement un caractère

```sql
LIKE '_o%': Renvoie toutes les valeurs où la seconde lettre est o
LIKE 'a%': Renvoie toutes les valeurs commençant par 'a'.
LIKE '%o': Renvoie toutes les valeurs terminant par 'o'.
LIKE '%or%': Renvoie toutes les valeurs contenant 'or'.

SELECT *
FROM users
WHERE first_name LIKE 'D%';

SELECT *
FROM users
WHERE last_name LIKE '%son';

SELECT *
FROM users
WHERE first_name LIKE '_____';

SELECT *
FROM users
WHERE job LIKE '%Doctor%';
```