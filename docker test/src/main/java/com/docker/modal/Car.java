package com.docker.modal;

public class Car {
    private String id;
    private String color;

    public Car(){

    }

    public Car(String id,String color){
        this.id=id;
        this.color=color;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
