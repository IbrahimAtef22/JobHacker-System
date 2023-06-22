package Week11.week11tasks.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcTask1 {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/myDB";
            String userName = "root";
            String password = "password";
            Connection con = DriverManager.getConnection(url, userName,password);
            PreparedStatement pst = con.prepareStatement("SELECT * FROM Info");
            ResultSet result = pst.executeQuery();

            while (result.next()){
                System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getInt(4));
            }
            con.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
