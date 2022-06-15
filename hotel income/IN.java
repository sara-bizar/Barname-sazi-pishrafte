package tempentity;

import model.RREntity;
import model.RRService;

import java.util.List;

public class IN {

    public long income() throws Exception{
        long income1=0;
        List<RREntity> rRooms = RRService.RRSGetInstance().report();
        for (RREntity rr: rRooms) {
            if (rr.getReservationDateTime().compareTo("2022/06/01-00:00")>0 &&
            rr.getReservationDateTime().compareTo("2022/07/01-00:00")<0){
            income1+=rr.getInitialPay();}
        }
        return income1;
    }
}
