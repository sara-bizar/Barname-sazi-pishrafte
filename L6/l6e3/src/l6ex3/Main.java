package l6ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
        int code;
        int entryY;
        float ave;
        char chooser ;



        DB db=new DB();
        System.out.println("choose service(enter number)\n1.saving student info" +
                "2.editing student info 3.delete info");
        chooser= scanner.nextLine().charAt(0);
        switch (chooser){
            case '1':
                {   System.out.println("enter: ");
                    System.out.println("student name : ");
                    name=scanner.nextLine();
                    System.out.println("student code:");
                    code =Integer.parseInt(scanner.nextLine());
                    System.out.println("student entry year:");
                    entryY=Integer.parseInt(scanner.nextLine());
                    System.out.println("student average:");
                    ave=Float.parseFloat(scanner.nextLine());

            try {
                db.insert(code,name,entryY,ave);
            } catch (Exception e) {
                e.printStackTrace();
            }
                break;}

            case '2':
            {   System.out.println("enter: ");
                System.out.println("student name : ");
                name=scanner.nextLine();
                System.out.println("student code:");
                code =Integer.parseInt(scanner.nextLine());
                System.out.println("student entry year:");
                entryY=Integer.parseInt(scanner.nextLine());
                System.out.println("student average:");
                ave=Float.parseFloat(scanner.nextLine());

                try {
                    db.update(code,name,entryY,ave);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            break;}

            case '3':
            {
                System.out.println("enter student code :");
                code=Integer.parseInt(scanner.nextLine());
                try {
                    db.delete(code);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            default:{
                System.out.println("unidentified number .");
            }


        }

    }
}
