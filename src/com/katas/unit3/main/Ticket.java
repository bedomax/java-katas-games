package com.katas.unit3.main;

public class Ticket extends Transaction {
    private double cost;
    private String destination;

    public Ticket() {
        this.cost = 0;
        this.destination= null;
    }

    public void buy(double cost, String destination){
        this.cost = cost;
        this.destination = destination;
    }
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
