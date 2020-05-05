package com.uniacc.unit2.main;

import java.util.Scanner;

public final class  UI {
    public static  void inputTelevisionBrand(Scanner in, Television television){
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
    public static  void inputTelevisionModel(Scanner in, Television television){
        boolean error;
        do{
            try{
                television.setModel(in.nextLine());
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }
    public static  void inputTelevisionInch(Scanner in, Television television){
        boolean error;
        do{
            try{
                television.setInch(Integer.parseInt(in.nextLine()));
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }
    public static  void inputTelevisionTvCableName(Scanner in, Television television){
        boolean error;
        do{
            try{
                television.setTvCableName(in.nextLine());
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }
    public static  void inputTelevisionSmartTv(Scanner in, Television television){
        boolean error;
        do{
            try{
                television.setSmartTv(in.nextLine());
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }
    public static  void inputTelevisionPrice(Scanner in, Television television){
        boolean error;
        do{
            try{
                television.setPrice(Double.parseDouble(in.nextLine()));
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }

    public static  void inputIPCameraBrand(Scanner in, IPCamera ipcamera){
        boolean error;
        do{
            try{
                ipcamera.setBrand(in.nextLine());
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }

    public static  void inputIPCameraCode(Scanner in, IPCamera ipcamera){
        boolean error;
        do{
            try{
                ipcamera.setCode(in.nextLine());
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }

    public static  void inputIPCameraModel(Scanner in, IPCamera ipcamera){
        boolean error;
        do{
            try{
                ipcamera.setModel(in.nextLine());
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }
    public static  void inputIPCameraTurnDegrees(Scanner in, IPCamera ipcamera){
        boolean error;
        do{
            try{
                ipcamera.setTurnDegrees(Integer.parseInt(in.nextLine()));
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }
    public static  void inputIPCameraMegapixeles(Scanner in, IPCamera ipcamera){
        boolean error;
        do{
            try{
                ipcamera.setMegapixels(Double.parseDouble(in.nextLine()));
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }
    public static  void inputIPCameraMetersWifi(Scanner in, IPCamera ipcamera){
        boolean error;
        do{
            try{
                ipcamera.setMetersWiFi(Double.parseDouble(in.nextLine()));
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }

    public static  void inputIPCameraPrice(Scanner in, IPCamera ipcamera){
        boolean error;
        do{
            try{
                ipcamera.setPrice(Double.parseDouble(in.nextLine()));
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }
}

