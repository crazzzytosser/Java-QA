package org.example;

import java.util.Random;

public class Simulator  {

    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.simulate();
    }

    public void simulate() {
        Player win = new Player(true);
        Player notWin = new Player(false);

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int seed = random.nextInt();
            playOneRound(win, seed);
            playOneRound(notWin, seed);
        }
//        System.out.println("Поражений: " + win.getWinCounter());
//        System.out.println("Побед: " + notWin.getWinCounter());
    }

    private void playOneRound(Player player, int seed) {
        playOneRound(player, new MontyHall(seed, 3));
    }

    private void playOneRound(Player player, MontyHall montyHall) {
        montyHall.chooseDoor();
        montyHall.openDoor();
        if (player.preferresChange()) {
            montyHall.changeDoor();
        }
        if (Price.CAR == montyHall.getPrice()) {
            player.increaseWinCounter();
        }
    }
}

