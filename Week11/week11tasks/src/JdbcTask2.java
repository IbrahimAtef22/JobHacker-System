package Week11.week11tasks.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


public class JdbcTask2 {
    public static void main(String[] args) {
        try{
            String url = "jdbc:mysql://localhost:3306/myDB";
            String userName = "root";
            String password = "password";
            Connection con = DriverManager.getConnection(url, userName,password);
            String sql = "CREATE TABLE IF NOT EXISTS Employee(\n" +
                    "\tId INT PRIMARY KEY NOT NULL,\n" +
                    "    F_Name VARCHAR(50),\n" +
                    "    L_Name VARCHAR(50),\n" +
                    "    Sex VARCHAR(15),\n" +
                    "    Age INT,\n" +
                    "    Address VARCHAR(100),\n" +
                    "    Phone_Number VARCHAR(20),\n" +
                    "    Vacation_Balance INT DEFAULT 30\n" +
                    ");";
            PreparedStatement pst = con.prepareStatement(sql);
            int i = pst.executeUpdate();
            System.out.println(i +" table created");

            String sql2 = "INSERT INTO Employee VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement pst2 = con.prepareStatement(sql2);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            do{
                System.out.println("Enter Id:");
                int id=Integer.parseInt(br.readLine());
                System.out.println("first_name:");
                String f_name=br.readLine();
                System.out.println("last_name:");
                String l_name=br.readLine();
                System.out.println("sex:");
                String sex =br.readLine();
                System.out.println("age:");
                int age =Integer.parseInt(br.readLine());
                System.out.println("address:");
                String address =br.readLine();
                System.out.println("phone_number:");
                String phone_number =br.readLine();
                System.out.println("Vacation_Balance:");
                int vacation_balance =Integer.parseInt(br.readLine());

                pst2.setInt(1, id);
                pst2.setString(2, f_name);
                pst2.setString(3,l_name);
                pst2.setString(4, sex);
                pst2.setInt(5, age);
                pst2.setString(6, address);
                pst2.setString(7, phone_number);
                pst2.setInt(8, vacation_balance);

                int j=pst2.executeUpdate();
                System.out.println(j+" records affected");

                System.out.println("Do you want to continue: y/n");
                String s=br.readLine();
                if(s.startsWith("n")){
                    break;
                }

            }while (true);

            String sql3 = "UPDATE Employee\n" +
                        "SET Vacation_Balance = 45\n" +
                        "WHERE Age > 45;";
            String sql4 = "UPDATE Employee\n" +
                        "SET F_Name = 'Mr/Mrs'+F_Name\n" +
                        "WHERE Age > 45;";
            Statement st = con.createStatement();
            st.addBatch(sql3);
            st.addBatch(sql4);

            st.executeBatch();

            con.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
