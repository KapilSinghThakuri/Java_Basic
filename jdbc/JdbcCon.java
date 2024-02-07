import java.sql.*;
public class JdbcCon {
    public static void main(String[] args) {
        try{
            // Loading Driver Class
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Creating connections with Database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/College","root","kapil12345");
            // Creating Statement
            Statement stmt = con.createStatement();
            // Executing Queries
            ResultSet rs = stmt.executeQuery("SELECT * FROM StudentTable where StudentId=1");
            while(rs.next()){
                System.out.println("Id:"+rs.getInt(1) + " Name:" + rs.getString(2) +" Age:"+rs.getInt(3));
            }
            // Destroy/Close Connection
            con.close();
        }
        catch(Exception e){
            // e.printStackTrace();
            System.out.println(e);
        }
    }
}