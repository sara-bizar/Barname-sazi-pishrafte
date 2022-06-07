package controller;

import model.Service;
import view.View;

public class Controller {
    View view=new View();
    public void chooseService(){
        String chooser=view.chooseService();
        if (chooser.equals("1")){
            buyingProsses();
        }

        else if (chooser.equals("2"))
            watchingCars();
    }

    public void buyingProsses(){


        try {
            Service.getInstance().buyCar( view.buyerInfoForm());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void watchingCars(){

        try {
            view.showingCars( Service.getInstance().showCars());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
