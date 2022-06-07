package model.repository;

public class Entity {
    private String userName;
    private String  password;
    private int bill;
    private float internetVolume;

    public String getUserName() {
        return userName;
    }

    public Entity setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Entity setPassword(String password) {
        this.password = password;
        return  this;
    }

    public int getBill() {
        return bill;
    }

    public Entity setBill(int bill) {
        this.bill = bill;
        return  this;
    }

    public float getInternetVolume() {
        return internetVolume;
    }

    public Entity setInternetVolume(float internetVolume) {
        this.internetVolume = internetVolume;
        return this;
    }
}
