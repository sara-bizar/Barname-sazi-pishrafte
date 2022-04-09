package l5e3;

public class E3 {
    public static void main(String[] args) {
        CarFactory carfactory = new CarFactory();
        Car car1 = carfactory.chooseCar("L90");
        car1.settingVariabes();

        System.out.println("rate: "+car1.rate+"   motor sylinder NO: "+car1.motorSylinderNo+"   polluting degree :"+car1.pollutingDegree);

    }

}
