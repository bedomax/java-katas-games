package com.katas.unit2.main;

public class IPCamera extends Device {

    private String model;
    private String code;
    private int turnDegrees;
    private double megapixels;
    private double metersWiFi;

    public IPCamera(){
        super();
    }

    public void setModel(String name) {
        if(!Validation.IPCameraModelName(name))
            throw new NullPointerException(Constants.IPCAMERA_ERROR_MODEL);
        this.model = name;
    }

    public String getModel(){
        return model;
    }

    public void setCode(String code){
        if(!Validation.IPCameraCode(code))
            throw new NullPointerException(Constants.IPCAMERA_ERROR_CODE);
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }

    public void setTurnDegrees(int num){
        if(!Validation.IPCameraTurnDegrees(num))
            throw new NullPointerException(Constants.IPCAMERA_ERROR_TURN_DEGREES);
        this.turnDegrees = num;
    }
    public int getTurnDegrees(){
        return this.turnDegrees;
    }

    public void setMegapixels(double num){
        if(!Validation.IPCameraMegapixels(num))
            throw new NullPointerException(Constants.IPCAMERA_ERROR_MEGAPIXELES);
        this.megapixels = num;
    }
    public double getMegapixels(){
        return this.megapixels;
    }

    public void setMetersWiFi(double num){
        if(!Validation.IPCameraMetersWifi(num))
            throw new NullPointerException(Constants.IPCAMERA_ERROR_METERS_WIFI);
        this.metersWiFi = num;
    }
    public double getMetersWiFi(){
        return this.metersWiFi;
    }

    @Override
    public void setPrice(double price) {
        if(!Validation.IPCameraPrice(price))
            throw new NullPointerException(Constants.IPCAMERA_ERROR_PRICE);
        super.setPrice(price);
    }
    @Override
    public String toString(){
        String imprimir;
        imprimir = String.format("\n *** IMPRIME IPCamera Ingresada por el usuario *** \n" +
                        " Marca: %s \n" +
                        " Código: %s \n" +
                        " Modelo: %s \n" +
                        " Giro: %s \n" +
                        " Megapixeles: %s \n" +
                        " Metros de alcance de la Wifi: %s \n" +
                        " Valor en dólares: %s",
                this.getBrand(),
                this.getModel(),
                this.getCode(),
                this.getTurnDegrees(),
                this.getMegapixels(),
                this.getMetersWiFi(),
                this.getPrice());
        return imprimir;
    }
}
