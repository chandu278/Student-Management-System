import java.sql.*;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    DBConfig.URL,
                    DBConfig.USERNAME,
                    DBConfig.PASSWORD
            );

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());

        } catch (SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }

        return con;
    }
}
