package com.uniacc.unit2.main;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Television television = new Television();
        IPCamera ipcamera = new IPCamera();
        String opcion;

        do{
            System.out.println("*** Programa *** ");
            System.out.println("Seleccione una opción");
            System.out.println("1) Television ");
            System.out.println("2) Cámara IP ");
            System.out.println("3) Salir ");
            opcion = in.nextLine();
            if(opcion.equals("1")){
                System.out.println("\n| Información Televisión ");
                System.out.println("| Marca: ");
                UI.inputTelevisionBrand(in,television);
                System.out.println("| Modelo: ");
                UI.inputTelevisionModel(in,television);
                System.out.println("| Pulgadas: ");
                UI.inputTelevisionInch(in,television);
                System.out.println("| SmartTV: ");
                UI.inputTelevisionSmartTv(in,television);
                System.out.println("| Nombre de TvCable: ");
                UI.inputTelevisionTvCableName(in,television);
                System.out.println("| Price: ");
                UI.inputTelevisionPrice(in,television);
                System.out.println(television.toString());
            }
            if(opcion.equals("2")){
                System.out.println("\n| Cámara IP ");
                System.out.println("| Marca: ");
                UI.inputIPCameraBrand(in,ipcamera);
                System.out.println("| Código: ");
                UI.inputIPCameraCode(in,ipcamera);
                System.out.println("| Modelo: ");
                UI.inputIPCameraModel(in,ipcamera);
                System.out.println("| Giro: ");
                UI.inputIPCameraTurnDegrees(in,ipcamera);
                System.out.println("| Megapixeles: ");
                UI.inputIPCameraMegapixeles(in,ipcamera);
                System.out.println("| Metros Wifi: ");
                UI.inputIPCameraMetersWifi(in,ipcamera);
                System.out.println("| Precio: ");
                UI.inputIPCameraPrice(in,ipcamera);
                System.out.println(television.toString()+"\n\n");
            }
        }while(!opcion.equals("3"));
        System.out.printf("*** Cerrar Programa *** ");
    }
}
