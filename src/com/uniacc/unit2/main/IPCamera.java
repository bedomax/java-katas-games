package com.uniacc.unit2.main;

import com.uniacc.unit2.main.Device;

public class IPCamera extends Device {

    private Model model;
    private String code;
    private int turnDegrees;
    private float megapixels;

    public IPCamera(){
        model = new Model();
    }

    public void setCode(String code){
        if(!Validation.IPCameraCode(code))
            throw new NullPointerException(Constants.ERROR);
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
}
