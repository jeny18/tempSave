import java.sql.*;

public class JDBC

{
public static void main(String[] args) throws SQLException {
                // TODO Auto-generated method stub

                String host = "localhost";
                String port = "3306";


                Connection con = DriverManager.getConnection("jdbc:mysql://"+ host + ":" + port +"/Qadbt", "root", "rootuser1");

                Statement s = (com.mysql.jdbc.Statement) con.createStatement();
                ResultSet rs = s.executeQuery("select * from employeeinfo where name = 'sam'");

                while (rs.next())

                {
                    System.out.println(rs.getInt("id"));
                    System.out.println(rs.getString("location"));
                    System.out.println(rs.getInt("age"));
                }

            }

}

