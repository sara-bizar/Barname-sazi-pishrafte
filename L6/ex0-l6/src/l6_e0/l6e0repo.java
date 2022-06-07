package l6_e0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class l6e0repo {

    private String driverName = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private String dbUsername ="sara";
    private String dbPass = "srbz77";

    Connection con;
    PreparedStatement preparedStatement;

    public void dbSign_up(String userName,String password,String name,String email) throws Exception{

        Class.forName(driverName);
        con = DriverManager.getConnection(url,dbUsername,dbPass);
        con.setAutoCommit(false);
        preparedStatement=con.prepareStatement("insert into l6e0 (username,pass,name,email) values (?,?,?,?)");

        preparedStatement.setString(1,userName);
        preparedStatement.setString(2,password);
        preparedStatement.setString(3,name);
        preparedStatement.setString(4,email);

        preparedStatement.executeUpdate();

        con.commit();
        preparedStatement.close();
        con.close();

        System.out.println("you're successfully signed up");
    }

    public boolean dbUserEntry(String userName1, String password1)throws Exception{
        Class.forName(driverName);
        con = DriverManager.getConnection(url,dbUsername,dbPass);
        con.setAutoCommit(false);

        preparedStatement=con.prepareStatement("select username,pass from l6e0 where username=? and pass=?");

        preparedStatement.setString(1,userName1);
        preparedStatement.setString(2,password1);

        ResultSet resultSet=preparedStatement.executeQuery();

        UsernamePass usernamePass1 = new UsernamePass();

        if (resultSet.next()){


        usernamePass1.setUserName(resultSet.getString("username"));
        usernamePass1.setPass(resultSet.getString("pass"));}

        if (usernamePass1.getUserName()!= null && usernamePass1.getPass() != null) {
            System.out.println("user sign-in successful . \n welcome user " + usernamePass1.getUserName());
            return  true;
        }
        else {
            System.out.println("user sign-in failed .\n wrong username or password . ");
            return false;
        }

    }

}
