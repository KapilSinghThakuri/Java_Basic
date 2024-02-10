import java.sql.*;

public  class PreparedStmtEg{
    public static void main(String[] args) {
        try{String hostname = "jdbc:mysql://localhost:3306/Food";
                String user = "root";
                String password = "kapil12345";
                // load Driver Class
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Create Connection with database.
                Connection con = DriverManager.getConnection(hostname,user,password);
                // Create Statement
        // For inserting data
                // PreparedStatement pstmt = con.prepareStatement("INSERT into Customer values(?,?,?,?)");
                // pstmt.setInt(1,5);
                // pstmt.setString(2,"Kapil Thakuri");
                // pstmt.setInt(3,21);
                // pstmt.setString(4,"Nepal");
        // For Updating data
                PreparedStatement pstmt = con.prepareStatement("UPDATE Customer SET CustomerName = ? WHERE CustomerId = ?");
                pstmt.setString(1,"Kapil Thakuri");
                pstmt.setInt(2,3);
        // For Delete data
                // PreparedStatement pstmt = con.prepareStatement("DELETE From Customer WHERE CustomerId = ?");
                // pstmt.setInt(1,2);

                int i = pstmt.executeUpdate();
                System.out.println(i + "Data Inserted !");
                con.close();
            }catch(Exception e){
                e.printStackTrace();
            }
    }
}