import org.junit.jupiter.api.Test;

import java.sql.*;

public class DatabaseTest {
    @Test
    public void test() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/status_music", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM test;");
        while(resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }
        statement.close();
    }
}
