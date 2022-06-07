package l6ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        employeeE em = new employeeE();
        char chooser ;
        int code;



        DB db=new DB();
        System.out.println("choose service(enter number)\n1.saving employee info" +
                " 2.delete info");
        chooser= scanner.nextLine().charAt(0);
        switch (chooser){
            case '1':
            {   System.out.println("enter: ");
                System.out.println("employee name : ");
                em.setName(scanner.nextLine());
                System.out.println("employee code:");
                em.seteCode( Integer.parseInt(scanner.nextLine()));
                System.out.println("employee melli code:");
                em.setMeliCode(Integer.parseInt(scanner.nextLine()));
                System.out.println("employee salary :");
                em.setSalary(Integer.parseInt(scanner.nextLine()));
                System.out.println("employee ' s father 's name : ");
                em.setFathersName(scanner.nextLine());
                System.out.println("work exp:");
                em.setWorkExp(Integer.parseInt(scanner.nextLine()));

                try {
                    db.insert(em);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;}



            case '2':
            {
                System.out.println("enter employee code :");
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
    }}}

