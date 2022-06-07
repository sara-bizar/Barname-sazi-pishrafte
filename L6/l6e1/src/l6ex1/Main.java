package l6ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name;
       UserEnti user =new UserEnti();
        char chooser ;



        DB db=new DB();
        System.out.println("choose service(enter number)\n1.saving uuser info" +
                "2.editing user info ");
        chooser= scanner.nextLine().charAt(0);
        switch (chooser){
            case '1':
            {   System.out.println("enter: ");
                System.out.println("user name : ");
                user.setuName(scanner.nextLine());
                System.out.println("user password : ");
                user.setuName(scanner.nextLine());
                System.out.println("user exclusive code:");
                user.setuCode(Integer.parseInt(scanner.nextLine()));
                System.out.println("email:");
                user.setEmail(scanner.nextLine());
                System.out.println("education:");
                user.setEducation(scanner.nextLine());
                System.out.println("age :");
                user.setAge(Integer.parseInt(scanner.nextLine()));




                try {
                    db.insert(user);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;}

            case '2':
            { System.out.println("enter: ");
                System.out.println("user name : ");
                user.setuName(scanner.nextLine());
                System.out.println("user password : ");
                user.setuName(scanner.nextLine());
                System.out.println("user exclusive code:");
                user.setuCode(Integer.parseInt(scanner.nextLine()));
                System.out.println("email:");
                user.setEmail(scanner.nextLine());
                System.out.println("education:");
                user.setEducation(scanner.nextLine());
                System.out.println("age :");
                user.setAge(Integer.parseInt(scanner.nextLine()));

                try {
                    db.update(user);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;}


            default:{
                System.out.println("unidentified number .");
            }


        }
    }
}
