import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySqlAdsDao implements Ads {
    private Connection connection;

    public MySqlAdsDao() throws SQLException {
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                Config.getUrl(),
                Config.getUser(),
                Config.getPassword()
        );
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        String selectQuery = "SELECT * FROM ads";
        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(selectQuery);
            while (result.next()) {
                ads.add(new Ad(result.getLong("id"), result.getLong("user_id"), result.getString("title"), result.getString("description")));
            }
//            statement.execute(selectQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        System.out.println(ads);
        return ads;
    }

    @Override
   public Long insert(Ad ad) {
      String adTitle = ad.getTitle();
      String adDesc = ad.getDescription();
      long id = ad.getUserId();
      long userID = ad.getUserId();
      String insertStmt = "INSERT INTO ads (user_id, title, `description`) VALUES ("
              + userID + ", '" + adTitle + "', '" + adDesc + "'" + ")";
      try {
          Statement statement = connection.createStatement();
          statement.execute(insertStmt);

      } catch (SQLException e) {
          e.printStackTrace();
      }
      return null;
      }

}

