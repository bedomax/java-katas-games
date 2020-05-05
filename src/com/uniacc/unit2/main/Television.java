package com.uniacc.unit2.main;

import com.uniacc.unit2.main.Device;

public class Television extends Device {

    private String model;
    private int inch;
    private String tvCableName;
    private boolean smartTv;

    public Television(){
        super();
    }
    public void setModel(String name){
        if(!Validation.TelevisionModelName(name))
            throw new NullPointerException(Constants.ERROR);
        this.model = name;
    }
    public String getModel(){
        return this.model;
    }
    public void setInch(int num) {
        if(!Validation.TelevisionInch(num))
            throw new NullPointerException(Constants.ERROR);
        this.inch = num;
    }
    public int getInch() {
        return this.inch;
    }
    public void setSmartTv(String option){
        if(!Validation.TelevisionSmartTV(option))
            throw new NullPointerException(Constants.ERROR);
        this.smartTv = option == Constants.TRUE_ESP? true : false;
    }
    public boolean getSmartTV() {
        return this.smartTv;
    }
    public void setTvCableName(String name) {
        if(!Validation.TelevisionTvCableName(name))
            throw new NullPointerException(Constants.ERROR);
        this.tvCableName = name;
    }
    public String getTvCableName() {
        return this.tvCableName;
    }

    @Override
    public void setPrice(double price) {
        if(!Validation.TelevisionPrice(price))
            throw new NullPointerException(Constants.ERROR);
        super.setPrice(price);
    }
}
