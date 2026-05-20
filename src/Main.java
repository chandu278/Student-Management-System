import java.util.*;
import java.sql.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        int age,marks;
        char gender;

        System.out.println("========= STUDENT MANAGEMENT SYSTEM =========");
        while(true){
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Update Student");
        System.out.println("4. Update Student Age");
        System.out.println("5. Update Student Marks");
        System.out.println("6. Update Student Name ");
        System.out.println("7. Update Student Gender");
        System.out.println("8. Search Student By ID");
        System.out.println("9. Delete Student");
        System.out.println("10. Exit");

        System.out.print("Enter your choice:");
        int choice =sc.nextInt();
        sc.nextLine();
        StudentService studentService = new StudentService();
        Student s;
            switch(choice){

            case 1:

               System.out.println("Enter Student Name:");
               name = sc.nextLine();
               System.out.println("Enter Student Age:");
                age = sc.nextInt();
                sc.nextLine();
               System.out.println("Enter Student Gender:");
               gender = sc.nextLine().charAt(0);
               System.out.println("Enter Student Marks:");
               marks = sc.nextInt();
               s=new Student(name,age,gender,marks);
                studentService.addStudent(s);
                    break;
            case 2: studentService.viewStudent();
                    break;
            case 3:
                    System.out.println("Enter Student Id:");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Student Name:");
                    name = sc.nextLine();

                    System.out.println("Enter Student Age:");
                    age = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Student Gender:");
                    gender = sc.nextLine().charAt(0);

                    System.out.println("Enter Student Marks:");
                    marks = sc.nextInt();

                    s = new Student(id, name, age, gender, marks);

                    studentService.updateStudents(s);

                    break;
            case 4:
                System.out.println("Enter Student id to update:");
                id = sc.nextInt();
                System.out.println("Enter Student Age to update:");
                age=sc.nextInt();

                studentService.updateAge(id,age);
                break;

            case 5:
                System.out.println("Enter Student id to update:");
                id = sc.nextInt();
                System.out.println("Enter Student Marks to update:");
                marks = sc.nextInt();
                studentService.updateMarks(id,marks);
                break;

            case 6:
                System.out.println("Enter Student id to update:");
                id = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Student Name to update:");
                name = sc.nextLine();

                studentService.updateName(id,name);
                break;

            case 7:
                    System.out.println("Enter Student id to update:");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Student Gender to update:");
                    gender = sc.nextLine().charAt(0);

                    studentService.updateGender(id, gender);

                    break;
            case 8:
                System.out.println("Enter Student id to search:");
                id = sc.nextInt();

                studentService.searchStudent(id);
                break;
            case 9:
                System.out.println("Enter Student id to delete from database:");
                id = sc.nextInt();

                studentService.deleteStudent(id);
                break;
            case 10:
                System.out.println("Thanks For Using Student Management System");
                sc.close();
                System.exit(0);

            default:
                System.out.println("Invalid choice");
                System.out.println("Please enter a vaild  choice fromm above ...");
                break;

        }
    }
    }
}
