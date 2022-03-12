package l3exercise0;

import java.util.Scanner;

public class L3E0 {
    public static void main(String[] args) {
        PersonalInfo[] userInfo;
        userInfo = new PersonalInfo[2];
        userInfo[0]= new PersonalInfo();
        userInfo[1]= new PersonalInfo();

        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("enter your  user information .");
            System.out.println("enter the name :");
            userInfo[i].name=scanner.nextLine();
            System.out.println("enter the age :");
            userInfo[i].age=scanner.nextLine();
            System.out.println("enter the family :");
            userInfo[i].family=scanner.nextLine();
        }

        try {
            userInfo[0].reiterativeChecking(userInfo[1]);
        } catch (ReiterativeException e) {
            e.printStackTrace();
        }
    }
}
