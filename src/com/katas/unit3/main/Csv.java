package com.katas.unit3.main;

import java.util.ArrayList;
import java.util.Iterator;

public class Csv implements Format {
    public String print(ArrayList<Seat> seats){
        String text ="";
        String separator = Constants.CHAR_SEPARATOR;
        Iterator<Seat> itr_seats = seats.iterator();
        while(itr_seats.hasNext()){
            Seat seat = itr_seats.next();
            if(!seat.getAvailable()){
                text += String.format("%s", seat.getNumber()+separator+
                        seat.getPerson().getName()+separator+
                        seat.getTicket().getDestination()+separator+
                        seat.getTicket().getCost());

            }else{
                text += String.format("%s", seat.getNumber()+separator+
                                            Constants.FREE_SEAT);

            }
            text +="\n";
        }
        return text;
    }
}
