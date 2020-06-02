package com.katas.unit3.main;

public class Seat {
    private int number;
    private Person person;
    private Ticket ticket;
    private Boolean available;

    public Seat(){
        this.number = 0;
        this.person = null;
        this.ticket = null;
        this.available = true;
    }


    public Seat(int number){
        this.number = number;
        this.person = null;
        this.ticket = null;
        this.available = true;
    }

    public Seat(Integer number, Person person, Ticket ticket, Boolean available) {
        this.number = number;
        this.person = person;
        this.ticket = ticket;
        this.available = available;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public Boolean getAvailable() {
        return available;
    }
    public void setAvailable(Boolean available) {
        this.available = available;
    }

}
