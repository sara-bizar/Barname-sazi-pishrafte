package control;

import model.repository.Entity;
import model.repository.Service;
import view.View;

public class Controller {
    Entity entity1 =new Entity();
    View view = new View();
    int choiceNum;


    public void flow1(){


        entity1=view.getUserInfo();
        choiceNum=view.choiceMeno();
        try {
            Service.getInstance().gettingNet(entity1,choiceNum);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
