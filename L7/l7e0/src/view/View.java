package view;

import model.UserEntity;

import java.util.Scanner;

public class View {
    public UserEntity userPassForm(){
        Scanner scanner= new Scanner(System.in);
        UserEntity userEntity= new UserEntity();

        System.out.println("please enter username : ");
        userEntity.setUserName(scanner.nextLine());
        System.out.println("please enter your password :");
        userEntity.setPass(scanner.nextLine());
        return userEntity;
    }

    public UserEntity userInfoForm(){
        Scanner scanner= new Scanner(System.in);
        UserEntity userEntity= new UserEntity();

        System.out.println("enter: ");
        System.out.println("user name :");
        userEntity.setUserName(scanner.nextLine());
        System.out.println(" name :");
        userEntity.setName(scanner.nextLine());
        System.out.println("user password:");
        userEntity.setPass(scanner.nextLine());
        System.out.println("user email :");
        userEntity.setEmail(scanner.nextLine());
        return userEntity;
    }

    public boolean choiceForm(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("do want to sign up(enter 1) or sign in(enter 2) ?");
        int sign=Integer.parseInt(scanner.nextLine()) ;
        if (sign==1) {
            return true;
        }


        else  {
            return false;
    }


}
}
