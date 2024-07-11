package org.example;

import java.util.ArrayList;
import java.util.List;

public class ComponentConteyners implements Interface {
    private final List<Interface> cars = new ArrayList<Interface>();
    public void draw(String color) {
        for(Interface car : cars) {
            car.draw(color);
        }
    }
    public void add(Interface s){
        this.cars.add(s);
    }
    public void clear(){
        System.out.println();
        this.cars.clear();
    }
}