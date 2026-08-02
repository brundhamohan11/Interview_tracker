# Interview_tracker
# Smart Interview Tracker

## Project Description

Smart Interview Tracker is a Java JDBC console application used to manage interview details. It allows users to add, view, update, and delete interview records stored in a MySQL database.

## Technologies Used

* Java
* JDBC
* MySQL
* VS Code

## Features

* Add a new interview
* View all interview records
* Update interview status
* Delete an interview
* Menu-driven console application

## Project Structure

```text
SmartInterviewTracker/
│
├── src/
│   ├── DBConnection.java
│   ├── Interview.java
│   ├── InterviewDAO.java
│   └── Main.java
│
└── database.sql
```

## Database

Database Name:

```
smart_interview_tracker
```

Table Name:

```
interviews
```

## Table Structure

| Column         | Data Type                         |
| -------------- | --------------------------------- |
| id             | INT (AUTO_INCREMENT, PRIMARY KEY) |
| company_name   | VARCHAR(100)                      |
| role           | VARCHAR(100)                      |
| interview_date | DATE                              |
| status         | VARCHAR(50)                       |

## How to Run the Project

1. Clone the repository.
2. Create the MySQL database.
3. Run the SQL script (`database.sql`) to create the table.
4. Download the MySQL Connector/J JAR and add it to your project.
5. Update the database URL, username, and password in `DBConnection.java`.
6. Run `Main.java`.

## Project Workflow

1. User selects an option from the menu.
2. Main.java receives the user input.
3. InterviewDAO.java executes the required SQL query.
4. DBConnection.java connects to the MySQL database.
5. Results are displayed to the user.

## CRUD Operations

* Create – Add a new interview
* Read – View all interviews
* Update – Update interview status
* Delete – Delete an interview record

## Future Enhancements

* Search interviews by company name
* Count total interviews
* Login authentication
* Export interview details to Excel or PDF
