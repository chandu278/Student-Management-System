# Student Management System (Java + JDBC + MySQL)

## 📌 About the Project

The Student Management System is a simple Java console-based application that uses JDBC and MySQL to manage student records. It performs basic CRUD operations like adding, viewing, updating, and deleting student data.

This project demonstrates how Java applications interact with databases using JDBC.

---

## ✨ Features

- Add new student details
- View all students
- Update existing student details
- Delete student records
- Simple console-based menu system

---

## 🛠️ Technologies Used

- Java
- JDBC
- MySQL
- VS Code / IntelliJ IDEA

---

## 📂 Project Structure

Student-Management-System/
├──src/

    ├── Student.java
    ├── DBConnection.java
    ├── Main.java
    ├── DAO.java

---

## 🗄️ Database Setup

```sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    marks DOUBLE
);


🚀 How to Run the Project
Install Java and MySQL
Start MySQL server
Create database and table using the SQL script above
Update DB credentials in DBConnection.java
Add MySQL JDBC connector to project
Run Main.java

Learning Outcomes
Understanding JDBC connectivity
Performing CRUD operations in Java
Working with MySQL database
Basic project structuring in Java
Console-based application development
