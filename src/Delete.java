import java.sql.*;

public class Delete {
    public  boolean deleteRecord(int id) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/juniorhack", "root", "chami")) {
            String query1 = " delete * from detail where id=?";
            PreparedStatement ob = connection.prepareStatement(query1);
            ob.setInt(1, id);
            boolean del = ob.execute(query1);
            return del;
        }

        }

}
