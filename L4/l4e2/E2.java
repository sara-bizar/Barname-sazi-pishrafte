package l4e2;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        UserInfo<String> p1 = new UserInfo<String>();
        System.out.println("please enter name : ");
        p1.setName(scanner.nextLine());
        System.out.println("please enter the school's name :  ");
        p1.setSchool(scanner.nextLine());
        System.out.println("please enter class number: ");
        p1.setClassNumber(scanner.nextLine());
        UserInfo p2 = null;
        UserInfo p3 = null;
        UserInfo p4 = null;

        try {
            p2 = (UserInfo) p1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        try {
            p3 = (UserInfo) p1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        try {
            p4 = (UserInfo) p1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        p2.printResult();
        p3.printResult();
        p4.printResult();

    }





}
