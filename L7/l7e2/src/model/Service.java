package model;

import java.util.List;

public class Service {
    private static final Service service= new Service();
    private Service(){}
    public static Service getInstance(){return service;}

    public void buyCar(BoughtCarsEntity boughtCar)throws Exception{
        try( Repository repository= new Repository()){
        repository.insertBoughtCars(boughtCar);
        repository.commit();
        }
    }

    public List<CarInfoEntity> showCars () throws Exception{
        try(Repository repository= new Repository()){

        List<CarInfoEntity> carsTable= repository.selectCarInfo();
        repository.commit();
        return carsTable;}
    }




}
