import java.sql.*;

public class NumberOfCredit {
    public int noOFCredit() throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/juniorhack", "root", "chami")) {
            String query1 = " SELECT COUNT(credit)\n" +
                    "FROM detail";
            Statement ob = connection.prepareStatement(query1);
            int cunt = ob.executeUpdate(query1);
            return cunt;
        }
        }


        public int noOFCredit(int x) throws SQLException {
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/juniorhack", "root", "chami")) {
                String query1 = " SELECT COUNT(credit)\n" +
                        "FROM detail where year=?";
                PreparedStatement ob = connection.prepareStatement(query1);
                ob.setInt(1, x);
                int sum1 = ob.executeUpdate(query1);
                int cunt = ob.executeUpdate(query1);
                return cunt;
            }
        }


    }
