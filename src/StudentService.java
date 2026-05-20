public class StudentService
{
    StudentDAO studentDAO;
    public StudentService()
    {
        studentDAO = new StudentDAO();
    }
    public void addStudent(Student student)
    {
        if(student.getAge()<0 || student.getAge()>100)
        {
            System.out.println("Invalid Input");
            return;
        }
        if(student.getMarks()<0 || student.getMarks()>100)
        {
            System.out.println("Invalid Input");
            return;
        }
        studentDAO.addStudent(student);
    }
    public void viewStudent()
    {
        studentDAO.viewStudent();
    }
    public void deleteStudent(int id)
    {

        studentDAO.deleteStudent(id);
    }
    public void updateStudents(Student student)
    {
        studentDAO.updateStudents(student);
    }
    public void updateMarks(int id,int marks)
    {
        studentDAO.updateMarks(id,marks);
    }
    public void updateGender(int id,char gender)
    {
        studentDAO.updateGender(id,gender);
    }
    public void updateName(int id,String name)
    {
        studentDAO.updateName(id,name);
    }
    public  void updateAge(int id,int age)
    {
        studentDAO.updateAge(id,age);
    }
    public void searchStudent(int id)
    {
        studentDAO.searchStudent(id);
    }
}
