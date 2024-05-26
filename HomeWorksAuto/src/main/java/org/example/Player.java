package org.example;

public class Player {

    private final boolean preferresChange;
    private int winCounter;

    Player(boolean preferresChange){
        this.preferresChange = preferresChange;
    }

    boolean preferresChange(){
        return preferresChange;
    }

    void increaseWinCounter() {
        winCounter = winCounter + 1;
    }

    int getWinCounter(){
        return winCounter;
    }
}
