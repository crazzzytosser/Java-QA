package org.example;
enum Price {
    GOAT, CAR
}

public class Door {

    private final Price price;

    Door(Price price){
        this.price = price;
    }

    Price getPrice() {
        return price;
    }
}

