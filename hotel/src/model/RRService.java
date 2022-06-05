package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RRService {

    private static final RRService rrService = new RRService();

    private RRService() {
    }

    public static RRService RRSGetInstance() {
        return rrService;
    }

    public void rRSave(RREntity entity, String roomType) throws Exception {
        ReservedRoomsRepo reservedRoomsRepo = new ReservedRoomsRepo();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fo = DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm");

        int emptyRoomNo = foundAnyEmptyRooms(roomType);

        if (emptyRoomNo != -1) {
            entity.setRoomNo(emptyRoomNo);
            entity.setReservationDateTime(now.format(fo));
            reservedRoomsRepo.rRInsert(entity);
            reservedRoomsRepo.rRCommit();
            reservedRoomsRepo.rRClose();
        }
    }

    //programmers note : if you want to edit reservedrooms records you must first specify what room's info witch
    // you want to change i used national code and roomno but there might be a problem what if the same person
    //reserved  this specific room in the past in that case both records will change and it might cause errors
    // in the system.a solution is to get all the records by that nationalcode and roomno show it in a combo box to the user
    //and ask them to choose the according to the date shown but that will require more code and more complicated
    //program <erase this later>
    public void rREdit(int oRoomNo, String originalNationalNumber, RREntity entity) throws Exception {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter fo = DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm");
        ReservedRoomsRepo reservedRoomsRepo = new ReservedRoomsRepo();
        //below checks if the new room is empty or not i think this should be checked in controller
        //if its checked there we can erase this if statement
        if (isEmpty(entity.getRoomNo()) || entity.getRoomNo() == oRoomNo) {
            entity.setReservationDateTime(now.format(fo));
            reservedRoomsRepo.rRUpdate(entity, originalNationalNumber, oRoomNo);
            reservedRoomsRepo.rRCommit();
            reservedRoomsRepo.rRClose();
        }
    }

    //this method only needs the person (who got the room)'s  nationalcode and the roomNo according to which
    //deletes the record this means other attributes can be empty
    public void rRRemove(RREntity entity) throws Exception {
        ReservedRoomsRepo reservedRoomsRepo = new ReservedRoomsRepo();
        reservedRoomsRepo.rRdelete(entity.getNationalCode(),entity.getRoomNo());
        reservedRoomsRepo.rRCommit();
        reservedRoomsRepo.rRClose();
    }

    //this method checks if a specific room is empty or not . it only needs room number
    public boolean isEmpty(int roomNo) throws Exception {

        ReservedRoomsRepo reservedRoomsRepo = new ReservedRoomsRepo();
        DateTimeFormatter fo = DateTimeFormatter.ofPattern("yyyy/MM/dd-HH:mm");
        LocalDateTime current = LocalDateTime.now();
        RREntity dateStuffOnly = reservedRoomsRepo.dateStuffSelect(roomNo);

        if (dateStuffOnly.getReservationDateTime() != null) {
            LocalDateTime dBDateTime = LocalDateTime.parse(dateStuffOnly.getReservationDateTime(), fo);
            LocalDateTime checkOutDate;
            checkOutDate = dBDateTime.plusDays(dateStuffOnly.getReservationDays());
            if (checkOutDate.isAfter(current))
                return false;
            else
                return true;
        } else
            return true;

    }

    //should i make this private
    //should be used in controller or service? maybe both- this method checks if there is any empty room and if
    // there is any  returns room number if didn't found any rooms returns -1
    public int foundAnyEmptyRooms(String roomType) throws Exception {

        int roomNo = -1;

        //for each - iterating throw all a special roomnumbers - checking them
        if (roomType.equals("normal")) {
            for (int i = 1; i < 11; i++) {
                if (isEmpty(i)) {
                    roomNo = i;
                    break;
                }
            }
        } else if (roomType.equals("special")) {
            for (int i = 11; i < 21; i++) {
                if (isEmpty(i)) {
                    roomNo = i;
                    break;
                }
            }
        }

        return roomNo;

    }

    //foundAnyEmptyRooms is used in edit and insert methods so it must change
    // to B version if you want to use it


    /*private int foundAnyEmptyRoomsB(String roomType,String roomView) throws  Exception{

        int roomNo=-1;
        //these arrayslists must be called from rooms service class and equality sighn must be added
        List<Integer> normalSea;
        List<Integer> specialSea;
        List<Integer> normalStreet;
        List<Integer> specialStreet;


        if (roomType.equals("normal") && (roomView.equals("sea")||roomView.equals("no view"))){
            for (int room:normalSea )
             {
                if(isEmpty(room)){
                    roomNo=room;
                    break;
                } } }
        else if (roomType.equals("special") && (roomView.equals("sea")||roomView.equals("no view"))){
            for (int room: specialSea )
            {
                if(isEmpty(room)){
                    roomNo=room;
                    break;
                } } }
        else if (roomType.equals("normal") && (roomView.equals("street")||roomView.equals("no view"))){
            for (int room: normalStreet )
            {
                if(isEmpty(room)){
                    roomNo=room;
                    break;
                } } }
        else if (roomType.equals("special") && (roomView.equals("street")||roomView.equals("no view"))){
            for (int room: specialStreet )
            {
                if(isEmpty(room)){
                    roomNo=room;
                    break;
                } } }

        return roomNo;
 }*/




}








