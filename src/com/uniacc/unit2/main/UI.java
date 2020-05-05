package com.uniacc.unit2.main;

import java.util.Scanner;

public final class  UI {
    public static  void inputTelevisionName(Scanner in, Television television){
        boolean error;
        do{
            try{
                television.setBrand(in.nextLine());
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }
}
