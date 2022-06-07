package controller;

import model.Service;
import view.View;

public class Controller {
    View view= new View();
    public void pro(){
      if (!view.choiceForm()){
        try {
            Service.getInstance().userEntry(view.userPassForm());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      else {
          try {
              Service.getInstance().sign_up(view.userInfoForm());
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
    }



}
