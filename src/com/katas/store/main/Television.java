package com.katas.store.main;

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
            throw new NullPointerException(Constants.TELEVISION_ERROR_MODEL);
        this.model = name;
    }
    public String getModel(){
        return this.model;
    }
    public void setInch(int num) {
        if(!Validation.TelevisionInch(num))
            throw new NullPointerException(Constants.TELEVISION_ERROR_INCH);
        this.inch = num;
    }
    public int getInch() {
        return this.inch;
    }
    public void setSmartTv(String option){
        if(!Validation.TelevisionSmartTV(option))
            throw new NullPointerException(Constants.TELEVISION_ERROR_SMART_TV);
        this.smartTv = option == Constants.TRUE_ESP? true : false;
    }
    public boolean getSmartTV() {
        return this.smartTv;
    }
    public void setTvCableName(String name) {
        if(!Validation.TelevisionTvCableName(name))
            throw new NullPointerException(Constants.TELEVISION_ERROR_TVCABLE_NAME);
        this.tvCableName = name;
    }
    public String getTvCableName() {
        return this.tvCableName;
    }

    @Override
    public void setPrice(double price) {
        if(!Validation.TelevisionPrice(price))
            throw new NullPointerException(Constants.TELEVISION_ERROR_PRICE);
        super.setPrice(price);
    }
    @Override
    public String toString(){
        String imprimir;
        imprimir = String.format("\n *** IMPRIME Televisión Ingresada por el usuario *** \n" +
                                " Marca: %s \n" +
                                " Modelo: %s \n" +
                                " Pulgadas: %s \n" +
                                " SmartTv: %s \n" +
                                " Nombre de la Empresa de Cable: %s \n" +
                                " Valor: %s",
                                this.getBrand(),
                                this.getModel(),
                                this.getInch(),
                                this.getSmartTV(),
                                this.getTvCableName(),
                                this.getPrice());
        return imprimir;
    }
}
