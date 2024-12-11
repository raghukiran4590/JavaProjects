package MyJDBC;

import java.sql.*;

public class MySQL {

    public static void main(String[] args) {
        try {
            // 1. Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish a connection
            String url = "jdbc:mysql://localhost:3306/mysql";
            String username = "root";
            String password = "root12345";
            Connection conn = DriverManager.getConnection(url, username, password);

            // 3. Create a statement
            Statement stmt = conn.createStatement();

            // 4. Execute a query
            ResultSet rs = stmt.executeQuery("SELECT version()");

            // 5. Process the result set
            while (rs.next()) {
                // Access data from the result set
                System.out.println(rs.getString("version()"));
            }

            // 6. Close the resources
            rs.close();
            stmt.close();
            conn.close();

        } catch ( SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}