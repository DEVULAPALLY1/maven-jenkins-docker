import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemoConnector {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/portaldb";
        String username = "root";
        String password = "aq1sw2aq1";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("Connected to database");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM students");

            System.out.println("\n--- Student Records ---");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("phoneno") + " | " +
                        rs.getString("email")
                );
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
