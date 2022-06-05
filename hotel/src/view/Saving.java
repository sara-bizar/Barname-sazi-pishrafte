package view;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import model.RREntity;
import model.RRService;

import java.util.Scanner;
//only for testing
public class Saving {

    public RREntity saveform(){

        RREntity rrEntity = new RREntity();
        System.out.println("enter :");
        Scanner scanner =new Scanner(System.in);
        System.out.println("pfullnname : ");
        rrEntity.setpFullName(scanner.nextLine());
        System.out.println("reservation days :");
        rrEntity.setReservationDays(Integer.parseInt(scanner.nextLine()));


        return rrEntity;

    }

    public RREntity deleteForm(){
        System.out.println("enter");
        RREntity entity =new RREntity();
        Scanner scanner =new Scanner(System.in);
        System.out.println("national number of rooms reserver");
        entity.setNationalCode(scanner.nextLine());
        System.out.println("room number :");
        entity.setRoomNo(Integer.parseInt(scanner.nextLine()));
        return entity;
    }

    public RREntity editInputInfo (){
        RREntity rrEntity= new RREntity();
        System.out.println("enterr ");
        Scanner scanner= new Scanner(System.in);
        System.out.println("full name :");
        rrEntity.setpFullName(scanner.nextLine());
        System.out.println("national code :");
        rrEntity.setNationalCode(scanner.nextLine());
        System.out.println("mobile number :");
        rrEntity.setMobileNo(scanner.nextLine());
        System.out.println("initial payment :");
        rrEntity.setInitialPay(Integer.parseInt(scanner.nextLine()));
        System.out.println("reservation days : ");
        rrEntity.setReservationDays(Integer.parseInt(scanner.nextLine()));
        System.out.println("room number :");
        rrEntity.setRoomNo(Integer.parseInt(scanner.nextLine()));
        System.out.println("thank you");
        return  rrEntity;
    }

    public String daysreserve (){
        System.out.println("how many days do want to stay? ");
        Scanner scanner= new Scanner(System.in);
        String reservationDays=scanner.nextLine();
        return reservationDays;
    }


    public int originalRooms(){
        System.out.println("which room number was it ? ");
        Scanner scanner= new Scanner(System.in);
        int oRooms =Integer.parseInt(scanner.nextLine());
        return oRooms;
    }

    public String originalNational(){
        System.out.println("which national number was it ? ");
        Scanner scanner= new Scanner(System.in);
        String oNation =scanner.nextLine();
        return oNation;
    }






}
