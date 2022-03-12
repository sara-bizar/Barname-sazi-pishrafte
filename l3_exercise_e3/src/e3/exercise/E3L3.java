package e3.exercise;

import java.util.Scanner;

public class E3L3 {
    public static void main(String[] args) {
        String string;

        Scanner scanner =new Scanner(System.in);
        System.out.println("please enter a string : ");
        string=scanner.nextLine();
        StringEvaluate evaluation = new StringEvaluate();
        evaluation.numberFounder(string);
        try {
            StringEvaluate.exceptionFinder(evaluation.ex,string);
    }
        catch (NumberFoundInStringException e){
            System.out.println(" exception found");
            e.printStackTrace();
        }


}}
