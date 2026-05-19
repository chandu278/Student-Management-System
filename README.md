
# Student Management System (JDBC)

Quick steps to set up MySQL, compile, and run the project on Windows (PowerShell / cmd).

Prerequisites
- Install JDK (11+ recommended) and ensure `java`/`javac` are on PATH.
- Install MySQL server and create a user with access to a database (default config in project: user `root`, password `chandu`).
- Download MySQL Connector/J (JAR) from https://dev.mysql.com/downloads/connector/j/ and place the JAR in a `lib` folder at the project root.

Database setup
1. Start MySQL server.
2. Run these SQL commands (for example via MySQL Shell or `mysql` CLI):

```sql
CREATE DATABASE StudentManagementSystem;
USE StudentManagementSystem;

CREATE TABLE students (
  Student_id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  age INT,
  gender CHAR(1),
  marks INT
);
```

3. If your MySQL user/credentials differ, update `src/com/students/util/DBConfig.java` accordingly.

Build and run (PowerShell)
1. Create `out` and `lib` (if not present) and place connector jar as `lib/mysql-connector-java.jar` (rename as you like).

```powershell
# from project root (where README.md is)
mkdir out -ErrorAction SilentlyContinue
mkdir lib -ErrorAction SilentlyContinue
# gather sources and compile
Get-ChildItem -Recurse -Filter *.java -Path src | ForEach-Object FullName > sources.txt
javac -d out @sources.txt
```

2. Run the program (include connector jar on classpath):

```powershell
# Example: adjust jar filename if different
java -cp "out;lib\mysql-connector-java.jar" com.students.main.Main
```

Build and run (Windows cmd)

```cmd
md out 2>NUL
md lib 2>NUL
REM create sources list (PowerShell recommended), or compile manually:
REM javac -d out src\com\students\**\*.java
javac -d out @sources.txt
java -cp out;lib\mysql-connector-java.jar com.students.main.Main
```

Notes
- If you do not want to use a real database for quick tests, you can comment out DAO calls in `Main` or mock `DBConnection.getConnection()` to return a dummy `Connection`. Running without the connector jar may still start but DB operations will throw runtime exceptions.
- Update `DBConfig` in `src/com/students/util/DBConfig.java` for different host/port/user/password.

Troubleshooting
- "Driver not found" on startup: ensure the Connector/J JAR is on runtime classpath (see `java -cp` above).
- Compilation errors: ensure `javac` version matches your language features and your `sources.txt` lists all `.java` files.

Example quick-run (exit immediately):

```powershell
# send choice 10 to exit the menu immediately
echo 10 | java -cp "out;lib\mysql-connector-java.jar" com.students.main.Main
```

If you'd like, I can add the connector JAR to a `lib/` folder in this repo (I can't download it for you), or run the program interactively now. Which would you prefer?
