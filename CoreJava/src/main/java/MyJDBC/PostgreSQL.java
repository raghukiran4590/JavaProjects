package MyJDBC;

import java.sql.*;

public class PostgreSQL {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String jdbcUrl = "jdbc:postgresql://localhost:5432/jdbl77";
        String username = "postgres";
        String password = "root123";

        // Register the PostgreSQL driver
        Class.forName("org.postgresql.Driver");

        // Connect to the database
        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

        // Perform desired database operations
        // Create a statement
        Statement stmt = connection.createStatement();

        //Execute a query
        ResultSet rs = stmt.executeQuery("SELECT version()");

        //Process the result set
        while (rs.next()) {
            // Access data from the result set
            System.out.println(rs.getString("version"));
        }

        stmt.execute("create table maven_dummy(id int, name varchar(255))");

        System.out.println("Table Created!!!");

        //Close the resources
        rs.close();
        stmt.close();
        connection.close();
    }
}