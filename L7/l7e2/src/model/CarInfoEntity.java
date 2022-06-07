package model;

public class CarInfoEntity {
   private String carModel;
   private String availableColors;

    public String getCarModel() {
        return carModel;
    }

    public CarInfoEntity setCarModel(String carModel) {
        this.carModel = carModel;
        return  this;
    }

    public String getAvailableColors() {
        return availableColors;
    }

    public CarInfoEntity setAvailableColors(String availableColors) {
        this.availableColors = availableColors;
        return this;
    }
}
