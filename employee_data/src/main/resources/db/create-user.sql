DROP USER 'employee_user'@'localhost';

CREATE USER 'employee_user'@'localhost' identified BY 'employee123';

GRANT ALL privileges ON employee_db.* TO 'employee_user'@'localhost';

FLUSH PRIVILEGES;

CREATE DATABASE employee_db;