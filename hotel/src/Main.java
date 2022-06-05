import model.RREntity;
import model.RRService;
import model.ReservedRoomsRepo;
import view.Saving;

import java.util.Scanner;
//only for testing
public class Main {
    public static void main(String[] args) {



       /*Scanner scanner =new Scanner(System.in);
        String roomType;
        Saving saving= new Saving();
        RREntity rrEntity= new RREntity();
        rrEntity=saving.saveform();

        System.out.println("room type : ");
        roomType=scanner.nextLine();*/

        /*try {
            ReservedRoomsRepo reservedRoomsRepo =new ReservedRoomsRepo();
             RREntity dateStuffOnly=  reservedRoomsRepo.dateStuffSelect(1);
            System.out.println(dateStuffOnly.getReservationDateTime());
        } catch (Exception e) {
            e.printStackTrace();
        }*/




     /* try {
            RRService.RRSGetInstance().rRSave(rrEntity,roomType);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

     /* Saving saving2 = new Saving();
        try {
            RRService.RRSGetInstance().rRRemove(saving2.deleteForm());
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        Saving saving3 = new Saving();
        int oRoomNo =saving3.originalRooms();
        String oNN =saving3.originalNational();
        RREntity entity =saving3.editInputInfo();

        try {
            // this part is repeated . after writing controller we can change it
           if (RRService.RRSGetInstance().isEmpty(entity.getRoomNo()) || entity.getRoomNo() == oRoomNo){
            RRService.RRSGetInstance().rREdit(oRoomNo,oNN,entity);}
           else
               System.out.println(" room not empty");
        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
