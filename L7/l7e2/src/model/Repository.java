package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Repository implements AutoCloseable {

    private Connection con;
    private PreparedStatement preparedStatement;

    public Repository() throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sara","srbz77");
        con.setAutoCommit(false);
    }

    public void insertCarInfo(CarInfoEntity entity) throws Exception{
        preparedStatement=con.prepareStatement("insert into l7e2carinfo  (carmodel,availablecollors) values (?,?)");
        preparedStatement.setString(1,entity.getCarModel());
        preparedStatement.setString(2,entity.getAvailableColors());
        preparedStatement.executeUpdate();
    }

    public void updateCarInfo (CarInfoEntity entity,String originalCarModel) throws Exception{
        preparedStatement=con.prepareStatement("update l7e2carinfo set carmodel=?,availablecolors=? where carmodel=?");
        preparedStatement.setString(1,entity.getCarModel());
        preparedStatement.setString(2,entity.getAvailableColors());
        preparedStatement.setString(3,originalCarModel);
        preparedStatement.executeUpdate();
    }

    public List<CarInfoEntity> selectCarInfo()throws  Exception{
        preparedStatement=con.prepareStatement("select carmodel,availablecolors from l7e2carinfo ");
        List<CarInfoEntity> carInfoEntities = new ArrayList<>();
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            CarInfoEntity entity = new CarInfoEntity();
            entity.setCarModel(resultSet.getString("carmodel"));
            entity.setAvailableColors(resultSet.getString("availablecolors"));
            carInfoEntities.add(entity);
        }
        return carInfoEntities;
    }

    public void insertBoughtCars(BoughtCarsEntity boughtCarsEntity) throws Exception{
        preparedStatement= con.prepareStatement("insert into l7e2bought (bname,bmelicode,bcarmodel,bcarcolor) values (?,?,?,?)");
        preparedStatement.setString(1,boughtCarsEntity.getName());
        preparedStatement.setString(2,boughtCarsEntity.getIdC());
        preparedStatement.setString(3,boughtCarsEntity.getCarModel());
        preparedStatement.setString(4, boughtCarsEntity.getCarColor());
        preparedStatement.executeUpdate();
    }
    public List<BoughtCarsEntity> selectB(BoughtCarsEntity halfEntity) throws  Exception{
     preparedStatement=con.prepareStatement("select bname,bmelicode,bcarmodel,bcarcolor from l7e2bought where bname=? and bmelicode=? ");
     preparedStatement.setString(1,halfEntity.getName());
     preparedStatement.setString(2,halfEntity.getIdC());
        ResultSet resultSet2 = preparedStatement.executeQuery();
        List<BoughtCarsEntity> boughtCarsEntities =new ArrayList<>();
        while ((resultSet2.next())){
            BoughtCarsEntity boughtCarsEntity = new BoughtCarsEntity();
            boughtCarsEntity.setName(resultSet2.getString("bname"));
            boughtCarsEntity.setIdC(resultSet2.getString("bmelicode"));
            boughtCarsEntity.setCarModel(resultSet2.getString("bcarmodel"));
            boughtCarsEntity.setCarColor(resultSet2.getString("bcarcolor"));
            boughtCarsEntities.add(boughtCarsEntity);
        }
        return  boughtCarsEntities;
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
