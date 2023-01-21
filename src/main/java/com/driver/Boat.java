package com.driver;

public class Boat implements WaterVehicle{
    String name = "jim";
    int capacity = 4;

    public void Boat(){

    }
    public void Boat(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
