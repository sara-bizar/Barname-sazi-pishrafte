package L4E1;

import java.util.Map;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentIntel test = new StudentIntel();
        String name;
        Float average;
        String av;//will turn into average Float
        String confirmation;

      while (true){
          System.out.println("enter the name and student number like the example (studentname-studentnumber) : ");
          name=scanner.nextLine();
          System.out.println("enter average :");
          av=scanner.nextLine();
          average=Float.parseFloat(av);
          test.stuinfo.put(name,average);
          System.out.println("any other name(yes/no)? ");
          confirmation=scanner.nextLine();
          if (confirmation.equals("no"))
              break;
      }

        for (Map.Entry<String,Float> test1 : test.stuinfo.entrySet()) {
            System.out.println("name: "+ test1.getKey()+"     average: "+ test1.getValue());
        }
    }
}
