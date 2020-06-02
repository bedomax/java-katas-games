package com.katas.exercises.main;

public class Rectangle {
    private Integer length;
    private Integer width;

    public Rectangle(Integer length, Integer width) {
        this.length = length;
        this.width = width;
    }

    void setLength(Integer length) {
        this.length = length;
    }

    void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getArea() {
        return this.length * this.width;
    }
}