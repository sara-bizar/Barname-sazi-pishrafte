package l4e3;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        StudentInfo<Float> student1 =new StudentInfo<>();
        System.out.println("enter name:");
        student1.setStudentName(scanner.nextLine());

        System.out.println("enter studentNumber:");
        student1.setStudentNumber(scanner.nextLine());

        System.out.println("enter student 's father 's name:");
        student1.setFathersName(scanner.nextLine());

        System.out.println("enter five marks : ");
        for (int i = 0; i <5 ; i++) {
           student1.markGetter(scanner.nextFloat());
        }

        System.out.println("student's info  ");
        System.out.println("name: " + student1.getStudentName());
        System.out.println("student number: " + student1.getStudentNumber());
        System.out.println("father's name: " + student1.getFathersName());
        System.out.println("marks: ");
        for (Float mark:student1.markList)
              {
                  System.out.println(mark);
        }
    }
}
