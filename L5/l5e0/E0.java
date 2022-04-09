package l5e0;

import java.util.Scanner;

public class E0 {
    public static void main(String[] args) {
        int x,y;//two input numbers

        CalcFactory calcFactory = new CalcFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a operation (+/-) : ");//choosing the classes

        Calculate calculate= calcFactory.chooser(scanner.nextLine().charAt(0));

        System.out.println("enter two numbers : ");
        x=scanner.nextInt();
        y= scanner.nextInt();
        System.out.println("result= "+calculate.calc(x,y));
    }



}
