package view;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import model.BoughtCarsEntity;
import model.CarInfoEntity;

import java.util.List;
import java.util.Scanner;

public class View {

    public String chooseService(){
        System.out.println("choose service . ");
        Scanner scanner= new Scanner(System.in);
        System.out.println("1. buying - 2.watching");
        return scanner.nextLine();
    }

    public BoughtCarsEntity buyerInfoForm(){
        System.out.println("please enter buyer's information : ");
        Scanner scanner= new Scanner(System.in);
        BoughtCarsEntity boughtCar =new BoughtCarsEntity();
        System.out.println("full name :");
        boughtCar.setName(scanner.nextLine());
        System.out.println("Melli code :");
        boughtCar.setIdC(scanner.nextLine());
        System.out.println("car model :");
        boughtCar.setCarModel(scanner.nextLine());
        System.out.println("car color :");
        boughtCar.setCarColor(scanner.nextLine());
        return  boughtCar;
    }

    public void showingCars (List<CarInfoEntity> carInfoEntities){
        System.out.println( "welcom here's our car models and the available colors:");
        for (CarInfoEntity en:carInfoEntities ) {
            System.out.println("car model : " + en.getCarModel()+ "   available colors :"+en.getAvailableColors());
        }

    }
}
