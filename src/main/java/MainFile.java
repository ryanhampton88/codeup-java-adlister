import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MainFile {

    public static void main(String[] args) throws SQLException {

        String createDB = "CREATE DATABASE IF NOT EXISTS";

        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                Config.getUrl(),
                Config.getUser(),
                Config.getPassword()
        );

        Statement statement = connection.createStatement();
        statement.execute("CREATE DATABASE IF NOT EXISTS adlister_db");
//        statement.execute("CREATE USER 'ryan'@'localhost' IDENTIFIED BY 'password'");
//        statement.execute("GRANT ALL ON adlister_db.* TO 'ryan'@'localhost'");

        statement.execute("USE adlister_db");

        statement.execute("CREATE TABLE IF NOT EXISTS users ( id INT UNSIGNED NOT NULL AUTO_INCREMENT, " +
                "username VARCHAR(50), password VARCHAR(50), PRIMARY KEY (id))");

        statement.execute("CREATE TABLE IF NOT EXISTS ads ( " +
                "id INT UNSIGNED NOT NULL AUTO_INCREMENT, " +
                "user_id INT UNSIGNED NOT NULL, " +
                "FOREIGN KEY (user_id) REFERENCES users (id), " +
                "title VARCHAR(50), " +
                "`description` VARCHAR(1000), " +
                "PRIMARY KEY (id))");

    }
}

