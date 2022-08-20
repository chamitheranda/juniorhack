import java.sql.*;

public class ViewResults {
    public void viewResults(int x) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/juniorhack", "root", "chami")) {
            String query1 = " SELECT * from detail where year=?";

            PreparedStatement ob = connection.prepareStatement(query1);
            ob.setInt(1, x);

            ResultSet rslt = ob.executeQuery(query1);
            while (rslt.next()) {
                System.out.println(rslt.getString("Course code"+"courseCode"));
                System.out.println(rslt.getString("Grade"+"grade"));
                System.out.println(rslt.getInt("Credits"+"credit"));


            }
            connection.close();
            ob.close();
            rslt.close();
        }

        }
    }
