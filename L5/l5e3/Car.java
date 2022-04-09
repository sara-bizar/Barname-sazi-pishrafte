package l5e3;

public abstract class Car {

    protected  byte motorSylinderNo;
    protected float rate;
    protected String pollutingDegree;

    public byte getMotorSylinderNo() {
        return motorSylinderNo;
    }


    public float getRate() {
        return rate;
    }


    public String getPollutingDegree() {
        return pollutingDegree;
    }

  public  void startEngin(){}

    public void  brake(){
    }

    public abstract void setMotorSylinderNo() ;


    public abstract void setRate() ;


    public abstract void setPollutingDegree() ;

    protected void settingVariabes(){
        this.setMotorSylinderNo();
        this.setPollutingDegree();
        this.setRate();
    }


}

