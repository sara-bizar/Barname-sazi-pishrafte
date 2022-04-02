package e0l4;

import java.util.Scanner;

public class E0 {
    public static void main(String[] args) {

        Bi test = new Bi();

        Scanner scanner = new Scanner(System.in);
        //SETTERS
        System.out.println("enter name: ");
        test.setName(scanner.nextLine());

        System.out.println("enter family: ");
        test.setFamily(scanner.nextLine());

        System.out.println("enter age: ");
        test.setAge(scanner.nextLine());

        System.out.println("enter pass: ");
        test.setPass(scanner.nextLine());

        System.out.println("enter username: ");
        test.setUsername(scanner.nextLine());

        System.out.println("enter job: ");
        test.setJob(scanner.nextLine());

        //GETTERS
        System.out.println("--------------------------");
        System.out.println("name: "+test.getName());
        System.out.println("family: "+test.getFamily());
        System.out.println("age: "+test.getAge());
        System.out.println("pass: "+test.getPass());
        System.out.println("username: "+test.getUsername());
        System.out.println("job: "+test.getJob());

    }

}
