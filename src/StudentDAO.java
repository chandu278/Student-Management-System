import java.sql.*;

public class StudentDAO {

    public void addStudent(Student s) {
        String query = "insert into students (name,age,gender,marks) values(?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, String.valueOf(s.getGender()));
            ps.setInt(4, s.getMarks());

            ps.executeUpdate();
            System.out.println("Data inserted successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void viewStudent() {
        String query = "select * from students";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                System.out.println(
                        "Id: " + rs.getInt("Student_id") +
                                " | Name: " + rs.getString("name") +
                                " | Age: " + rs.getInt("Age") +
                                " | Gender: " + rs.getString("Gender") +
                                " | Marks: " + rs.getInt("Marks")
                );

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteStudent(int id) {
        String query = "delete from students where student_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Deleted successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateName(int id, String name) {
        String query = "update students set name=? where student_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();

            System.out.println("Name updated successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateAge(int id, int age) {
        String query = "update students set age=? where student_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, age);
            ps.setInt(2, id);
            ps.executeUpdate();

            System.out.println("Age updated successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateGender(int id, char gender) {
        String query = "update students set gender=? where student_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, String.valueOf(gender));
            ps.setInt(2, id);
            ps.executeUpdate();

            System.out.println("Gender updated successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateMarks(int id, int marks) {
        String query = "update students set marks=? where student_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, marks);
            ps.setInt(2, id);
            ps.executeUpdate();

            System.out.println("Marks updated successfully");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStudents(Student s) {
        String query =
                "update students set name=?, age=?, gender=?, marks=? where student_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, s.getName());
            ps.setInt(2, s.getAge());
            ps.setString(3, String.valueOf(s.getGender()));
            ps.setInt(4, s.getMarks());
            ps.setInt(5, s.getId());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Student updated successfully");
            } else {
                System.out.println("Student not found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchStudent(int id) {
        String query = "select * from students where student_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            System.out.println("Student Details with student_id " + id + ":");

            boolean found = false;

            while (rs.next()) {
                found = true;

                System.out.println(
                        "Name: " + rs.getString("name") +
                                " | Age: " + rs.getInt("age") +
                                " | Gender: " + rs.getString("gender") +
                                " | Marks: " + rs.getInt("marks")
                );
            }

            if (!found) {
                System.out.println("Student not found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
