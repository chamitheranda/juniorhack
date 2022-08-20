import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ClearData {

    public boolean clearData() throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/juniorhack", "root", "chami")) {
            String query1 = "TRUNCATE TABLE `detail`";
            Statement ob = connection.prepareStatement(query1);
            boolean clear1 = ob.execute(query1);
            return  clear1;
        }


    }
}