package l6ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB {
    private Connection con;
    private PreparedStatement preparedStatement;


    public void insert (UserEnti user)throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sara","srbz77");
        con.setAutoCommit(false);
        preparedStatement= con.prepareStatement("insert into l6e1 (usercode,username,email,password,age,education) values (?,?,?,?,?,?)");
        preparedStatement.setInt(1,user.getuCode());
        preparedStatement.setString(2,user.getuName());
        preparedStatement.setString(3,user.getEmail());
        preparedStatement.setString(4,user.getPass());
        preparedStatement.setInt(5,user.getAge());
        preparedStatement.setString(6,user.getEducation());


        preparedStatement.executeUpdate();
        preparedStatement.close();
        con.close();
    }


    public void update (UserEnti user)throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sara","srbz77");
        con.setAutoCommit(false);
        preparedStatement= con.prepareStatement("update l6e1 set username=?,email=?,password=?,age=?,education=? where usercode=?");
        preparedStatement.setInt(6,user.getuCode());
        preparedStatement.setString(1,user.getuName());
        preparedStatement.setString(2,user.getEmail());
        preparedStatement.setString(3,user.getPass());
        preparedStatement.setInt(4,user.getAge());
        preparedStatement.setString(5,user.getEducation());


        preparedStatement.executeUpdate();
        preparedStatement.close();
        con.close();
    }



}
