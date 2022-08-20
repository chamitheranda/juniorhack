import java.sql.*;
import java.lang.Math;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class GpaCalculate {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public double currentGPA() throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/juniorhack", "root", "chami")) {
            String query1 = " SELECT SUM(gpa * credit)\n" +
                    "FROM detail as dataas ";
            Statement ob = connection.prepareStatement(query1);
            ResultSet sum1 = ob.executeQuery(query1);

            String query2 = " SELECT SUM(credit)\n" +
                    "FROM detail";
            Statement ob1 = connection.prepareStatement(query2);
            ResultSet sum2 = ob1.executeQuery(query2);

            int p =sum1.getInt(0);
            int q = sum1.getInt(0) ;
            double reslt = p/q ;


            return reslt;
        }
        }

    public double currentGPA(int x) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/juniorhack", "root", "chami")) {
            String query1 = " SELECT SUM(credit)\n" +
                    "FROM detail where year = ?";

            PreparedStatement ob = connection.prepareStatement(query1);
            ob.setInt(1, x);
            ResultSet sum1 = ob.executeQuery(query1);
            String query2 = " SELECT SUM(credit)\n" +
                    "FROM detail where year= ? ";
            PreparedStatement ob1 = connection.prepareStatement(query1);
            ob.setInt(1, x);
            ResultSet sum2 = ob.executeQuery(query2);
            int p =sum1.getInt("SUM(gpa * credit)");
            int q = sum1.getInt("SUM(credit)") ;
            double reslt = p/q ;


            return reslt;


        }
        }

    }







