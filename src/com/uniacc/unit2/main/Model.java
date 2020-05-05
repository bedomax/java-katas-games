package com.uniacc.unit2.main;

public class Model {
    String name;
    String type;

    public Model(){}
    public Model(String type){
        this.type = type;
    }

    //SETTER AND GETTERS
    public void setName(String name){
        if(getType().equals(Constants.MODEL_TYPE_TELEVISION)){
            if(!Validation.TelevisionModelName(name))
                throw new NullPointerException(Constants.ERROR);
        }
        if(getType().equals(Constants.MODEL_TYPE_IP_CAMARA)) {
            if(!Validation.IPCameraModelName(name))
                throw new NullPointerException(Constants.ERROR);
        }
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setType(String name){
        this.type = name;
    }
    public String getType(){
        return type;
    }


}