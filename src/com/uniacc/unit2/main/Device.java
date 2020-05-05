package com.uniacc.unit2.main;

public class Device {

    private String brand;
    private double price;

    public Device(){
        this.price = 0;
    }

    public void setBrand(String name) {
        if(!Validation.BrandName(name))
            throw new NullPointerException(Constants.DEVICE_ERROR_BRAND);
        this.brand = name;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

}
