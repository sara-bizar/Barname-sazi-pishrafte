package l3exercise2;

import java.util.Scanner;

public class L3E2 {
    public static void main(String[] args) {
        double a,b,c;
        Scanner scanner =new Scanner(System.in);
        System.out.println("imagine there is a equation like this : ax^2 +bx +c=0");
        System.out.println("enter a : ");
        a=scanner.nextDouble();
        System.out.println("enter b : ");
        b=scanner.nextDouble();
        System.out.println("enter c : ");
        c=scanner.nextDouble();
        EquationAnswer equation = new EquationAnswer( a, b, c);
        equation.deltaCalculator();
        try {
            equation.deltaEvaluate();
        } catch (DeltaNegativeException e) {
            e.printStackTrace();
        }
        equation.equationAnswer();
    }
}
