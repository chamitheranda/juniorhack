import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Register {
    public void register(){
        System.out.println("----- GPA CALCULATOR -----");

        Scanner s1 = new Scanner(System.in);
        System.out.print(" Enter Your Name : ");
        String name = s1.nextLine();
        System.out.println();

        Scanner sa = new Scanner(System.in);
        System.out.print(" course duration : ");
        int duration = sa.nextInt();
        System.out.println();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/juniorhack", "root", "chami")) {
            //   Statement st = connection.createStatement();
            try {
                String sql =  "INSERT INTO `juniorhack`.`register`\n" +
                        "(`name`,\n" +
                        "`duration`)\n" +
                        "VALUES\n" +
                        "(?,\n" +
                        "?)";

                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, name);
                statement.setInt(2, duration);

                int rowsInserted = statement.executeUpdate(sql);
                if (rowsInserted > 0) {
                    System.out.println("Congradulations ! Registration was completed . ");
                }
                statement.close();
                connection.close();

            } catch (Exception e){
                System.out.println(e);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
