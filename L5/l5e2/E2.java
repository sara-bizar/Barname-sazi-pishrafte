package l5e2;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter name : ");
        UserInfo.getInstance().setName(scanner.nextLine());

        System.out.println("enter classday : ");
        UserInfo.getInstance().setClassDay(scanner.nextLine());

        UserInfo.getInstance().printContent();

    }
}
