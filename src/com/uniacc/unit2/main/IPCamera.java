package com.uniacc.unit2.main;

import com.uniacc.unit2.main.Device;

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
            throw new NullPointerException(Constants.ERROR);
        this.model = name;
    }

    public String getModel(){
        return model;
    }

    public void setCode(String code){
        if(!Validation.IPCameraCode(code))
            throw new NullPointerException(Constants.ERROR);
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }

    public void setTurnDegrees(int num){
        if(!Validation.IPCameraTurnDegrees(num))
            throw new NullPointerException(Constants.ERROR);
        this.turnDegrees = num;
    }
    public int getTurnDegrees(){
        return this.turnDegrees;
    }

    public void setMegapixels(double num){
        if(!Validation.IPCameraMegapixels(num))
            throw new NullPointerException(Constants.ERROR);
        this.megapixels = num;
    }
    public double getMegapixels(){
        return this.megapixels;
    }

    public void setMetersWiFi(double num){
        if(!Validation.IPCameraMetersWifi(num))
            throw new NullPointerException(Constants.ERROR);
        this.metersWiFi = num;
    }
    public double getMetersWiFi(){
        return this.metersWiFi;
    }

    @Override
    public void setPrice(double price) {
        if(!Validation.IPCameraPrice(price))
            throw new NullPointerException(Constants.ERROR);
        super.setPrice(price);
    }
}
