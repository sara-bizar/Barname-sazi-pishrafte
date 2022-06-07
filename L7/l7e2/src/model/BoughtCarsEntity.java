package model;

public class BoughtCarsEntity {
   private String name;
   private String idC;
   private String carModel;
   private String carColor;

    public String getName() {
        return name;
    }

    public BoughtCarsEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getIdC() {
        return idC;
    }

    public BoughtCarsEntity setIdC(String idC) {
        this.idC = idC;
        return  this;
    }

    public String getCarModel() {
        return carModel;
    }

    public BoughtCarsEntity setCarModel(String carModel) {
        this.carModel = carModel;
        return this;
    }

    public String getCarColor() {
        return carColor;
    }

    public BoughtCarsEntity setCarColor(String carColor) {
        this.carColor = carColor;
        return this;
    }

}
