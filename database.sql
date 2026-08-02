CREATE DATABASE interview_tracker;
USE interview_tracker;
CREATE TABLE interviews (
    id INT AUTO_INCREMENT PRIMARY KEY,
    company_name VARCHAR(100),
    role VARCHAR(100),
    interview_date DATE,
    status VARCHAR(30)
);
SHOW TABLES;
SELECT * FROM interviews;
