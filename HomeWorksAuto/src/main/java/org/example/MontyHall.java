package org.example;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MontyHall {

    private final List<Door> doors;
    private Door selected;
    private Door openOne;
    private final Random random;
    private final int amountOfDoors;

    MontyHall(int seed, int amount) {
        random = new Random(seed);
        amountOfDoors = amount;
        doors = IntStream.range(0, amountOfDoors).
                mapToObj(e -> new Door(Price.GOAT)).
                collect(Collectors.toList());
        doors.set(random.nextInt(amountOfDoors), new Door(Price.CAR));
    }

    void chooseDoor(){
        selected = doors.get(random.nextInt(amountOfDoors));
    }

    void openDoor(){
        openOne = doors.stream().
                filter(d -> !d.equals(selected) && Price.GOAT == d.getPrice()).
                collect(Collectors.toList()).
                get(0);
    }

    void changeDoor(){
        selected = doors.stream().
                filter(d -> !d.equals(openOne) && !d.equals(selected)).
                collect(Collectors.toList()).
                get(0);
    }

    Price getPrice(){
        return selected.getPrice();
    }

}
