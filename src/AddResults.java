import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddResults {
    public void dataInsert(int a, String b, String c, int d, int e) {
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/juniorhack", "root", "chami")) {
            //   Statement st = connection.createStatement();
            try {
                String sql = "INSERT INTO `juniorhack`.`detail`\n" +
                        "(`year`,\n" +
                        "`courseCode`,\n" +
                        "`grade`,\n" +
                        "`credit`,\n" +
                        "`gpa`)\n" +
                        "VALUES\n" +
                        "(?,\n" +
                        "?,\n" +
                        "?,\n" +
                        "?,\n" +
                        "?)";


                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setInt(1, a);
                statement.setString(2, b);
                statement.setString(3, c);
                statement.setInt(4, d);
                statement.setInt(5, e);


                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new Student was inserted successfully");
                }
                statement.close();
                connection.close();

            } catch (Exception e1) {
                System.out.println(e1);
            }
        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
