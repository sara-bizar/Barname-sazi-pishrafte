package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class repo implements AutoCloseable{
    private Connection con;
    private PreparedStatement preparedStatement;

    public repo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sara","srbz77");
        con.setAutoCommit(false);
    }
//uses the same table as l6e0
    public void dbSign_up(UserEntity usernamePass) throws Exception{

        preparedStatement=con.prepareStatement("insert into l6e0 (username,pass,name,email) values (?,?,?,?)");

        preparedStatement.setString(1,usernamePass.getUserName());
        preparedStatement.setString(2,usernamePass.getPass());
        preparedStatement.setString(3,usernamePass.getName());
        preparedStatement.setString(4,usernamePass.getEmail());

        preparedStatement.executeUpdate();

    }

    public boolean dbUserEntry(UserEntity userEntity)throws Exception{


        preparedStatement=con.prepareStatement("select username,pass from l6e0 where username=? and pass=?");

        preparedStatement.setString(1,userEntity.getUserName());
        preparedStatement.setString(2,userEntity.getPass());

        ResultSet resultSet=preparedStatement.executeQuery();

        UserEntity usernamePass1 = new UserEntity();

        if (resultSet.next()){


            usernamePass1.setUserName(resultSet.getString("username"));
            usernamePass1.setPass(resultSet.getString("pass"));}

        if (usernamePass1.getUserName()!= null && usernamePass1.getPass() != null) {

            return  true;
        }
        else {

            return false;
        }
}

    public void commit() throws Exception{
        con.commit();
    }
    public  void close() throws Exception{
        preparedStatement.close ();
        con.close();
    }

    public void rollback() throws  Exception{
        con.rollback();
    }

}
