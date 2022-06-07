package l6_e0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        l6e0repo trial = new l6e0repo();
        String userName;
        String pass;
        String name,email;
        int sign;

        Scanner scanner = new Scanner(System.in);
        System.out.println("do want to sign up(enter 1) or sign in(enter 2) ?");
        sign=Integer.parseInt(scanner.nextLine()) ;
        if (sign==1) {

            System.out.println("please enter username :");

            userName = scanner.nextLine();
            System.out.println("please enter a password : ");
            pass = scanner.nextLine();
            System.out.println("please enter name : ");
            name = scanner.nextLine();
            System.out.println("please enter an email address : ");
            email = scanner.nextLine();

            try {
                trial.dbSign_up(userName,pass,name,email);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("");
        }

    else if (sign==2){


            System.out.println("please enter username : ");
            userName=scanner.nextLine();
            System.out.println("please enter your password :");
            pass=scanner.nextLine();

            try {
                trial.dbUserEntry(userName,pass);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
