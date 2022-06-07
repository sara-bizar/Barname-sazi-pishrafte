package view;

import model.repository.Entity;

import java.util.Scanner;

public class View {


    public int choiceMeno(){
        int number;
        System.out.println("choose one of the choices below (write the number) : ");
        System.out.println("1) 2 GB - 1000 T ");
        System.out.println("2) 4 GB - 2000 T");
        System.out.println("3) 10 GB - 5000 T");
        System.out.println("4) 25 GB - 10000 T");

        Scanner scanner= new Scanner(System.in);
        number=Integer.parseInt(scanner.nextLine());
        return number;
    }

    public Entity getUserInfo(){
        Entity user = new Entity();
        Scanner scanner =new Scanner(System.in);
        System.out.println("sigh-in\n");
        System.out.println("enter username : ");
        user.setUserName(scanner.nextLine());
        System.out.println("enter password : ");
        user.setPassword(scanner.nextLine());
        return user;
    }


}
