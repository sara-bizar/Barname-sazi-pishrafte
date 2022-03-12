package l2exercise1;

import java.util.Scanner;

public class L2E1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name,username,password;

        System.out.println("enter your name :");
        name=scanner.nextLine();

        System.out.println("enter your username :");
        username=scanner.nextLine();

        System.out.println("enter your password :");
        password=scanner.nextLine();
        UsernameAndPasswordChecker id = new UsernameAndPasswordChecker(name,username,password);
        try {
            id.check();
        } catch (UsernameOrPasswordException e) {
            e.printStackTrace();
        }
    }
}
