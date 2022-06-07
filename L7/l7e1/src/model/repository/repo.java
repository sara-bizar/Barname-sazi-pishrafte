package model.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class repo implements  AutoCloseable{
    private Connection con;
    private PreparedStatement preparedStatement;

    public repo() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sara","srbz77");
        con.setAutoCommit(false);
    }

    public void update(Entity user)throws Exception{
        preparedStatement=con.prepareStatement("update l7e1 set bill=?,internetvolum =? where username=? and pass=?");

        preparedStatement.setString(3,user.getUserName());
        preparedStatement.setString(4,user.getPassword());
        preparedStatement.setInt(1,user.getBill());
        preparedStatement.setFloat(2,user.getInternetVolume());

        preparedStatement.executeUpdate();
    }

    public Entity select(Entity user) throws  Exception{

        preparedStatement=con.prepareStatement("select * from l7e1 where username=? and pass=?");

        preparedStatement.setString(1,user.getUserName());
        preparedStatement.setString(2,user.getPassword());

        ResultSet resultSet=preparedStatement.executeQuery();

        Entity userInfo = new Entity();

        if(resultSet.next()){

            userInfo.setBill(resultSet.getInt("bill"));
            userInfo.setInternetVolume(resultSet.getFloat("internetvolum"));
            userInfo.setUserName(user.getUserName());
            userInfo.setPassword(user.getPassword());
        }
        return userInfo;
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
