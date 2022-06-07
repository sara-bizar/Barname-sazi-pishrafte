package l6ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB {
    private Connection con;
    private PreparedStatement preparedStatement;


    public void insert (int sCode,String sName ,int enteryY,float ave)throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sara","srbz77");
        con.setAutoCommit(false);
        preparedStatement= con.prepareStatement("insert into l6e3 (stcode,stname,stentryyear,stavrage) values (?,?,?,?)");
        preparedStatement.setInt(1,sCode);
        preparedStatement.setString(2,sName);
        preparedStatement.setInt(3,enteryY);
        preparedStatement.setFloat(4,ave);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        con.close();
    }

    public void  delete (int sCode) throws  Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sara","srbz77");
        con.setAutoCommit(false);
        preparedStatement= con.prepareStatement("delete from l6e3 where stcode=?");
        preparedStatement.setInt(1,sCode);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        con.close();
    }

    public void update (int sCode,String sName ,int enteryY,Float ave)throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sara","srbz77");
        con.setAutoCommit(false);
        preparedStatement= con.prepareStatement("update l6e3 set stname=?,stentryyear=?,stavrage=? where stcode=?");
        preparedStatement.setInt(4,sCode);
        preparedStatement.setString(1,sName);
        preparedStatement.setInt(2,enteryY);
        preparedStatement.setFloat(3,ave);

        preparedStatement.executeUpdate();
        preparedStatement.close();
        con.close();
    }


}
