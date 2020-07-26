package com.katas.crossword.main;
import com.katas.unit3.main.Person;

import java.io.*;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Crossword crossword;
        boolean error;
        Scanner in = new Scanner(System.in);
        crossword = new Crossword();
        System.out.println("*** Programa *** ");
        System.out.println("Matriz:");
        System.out.println(crossword.printMatriz());
        System.out.println("Ingrese la palabra a buscar:");
        do{
            try{
                crossword.process(in.nextLine());
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
        System.out.println("*** Resultados *** ");
        System.out.println("Esta presente:"+crossword.isPresent());
        if(crossword.isPresent()) {
            System.out.println("Posición primera letra:" + crossword.getFirstPositionArray());
            System.out.println("Posición última letra:" + crossword.getLastPositionArray());
        }
    }
}
