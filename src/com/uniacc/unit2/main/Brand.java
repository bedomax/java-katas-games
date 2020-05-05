package com.uniacc.unit2.main;

import java.io.IOException;

public class Brand {
    String name;

    //SETTER AND GETTERS
    public void setName(String name){
        if(!Validation.BrandName(name))
            throw new NullPointerException(Constants.ERROR);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
