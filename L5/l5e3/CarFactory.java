package l5e3;

public class CarFactory {
    public Car chooseCar (String carType){


        if(carType.equals(null))
            return null;
        switch (carType){

            case "L90" :
                return new L90();

            case "P260" :
                return new P260();

            case  "Pride" :
                return new Pride();

            default:
                System.out.println("invalid car type ");
                return null;
        }
    }

}
