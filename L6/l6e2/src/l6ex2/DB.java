package l6ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DB {
    private Connection con;
    private PreparedStatement preparedStatement;


    public void insert (employeeE em)throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sara","srbz77");
        con.setAutoCommit(false);
        preparedStatement= con.prepareStatement("insert into l6e2 (employeecode,name,mellicode,fathersname,post,salary,workexperience) values (?,?,?,?,?,?,?)");
        preparedStatement.setInt(1,em.geteCode());
        preparedStatement.setString(2,em.getName());
        preparedStatement.setInt(3,em.getMeliCode());
        preparedStatement.setString(4,em.getFathersName());
        preparedStatement.setString(5,em.getPost());
        preparedStatement.setInt(6,em.getSalary());
        preparedStatement.setInt(7,em.getWorkExp());

        preparedStatement.executeUpdate();
        preparedStatement.close();
        con.close();
    }

    public void  delete (int eCode) throws  Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sara","srbz77");
        con.setAutoCommit(false);
        preparedStatement= con.prepareStatement("delete from l6e2 where employeecode=?");
        preparedStatement.setInt(1,eCode);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        con.close();
    }
}
