package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class GameTest {

    @Test
    void positiveTestSimulator() {
        //given
        Simulator simulator = new Simulator();
        //
        int i;
        for (i = 0; i < 1000; i++) {
            simulator.simulate();
        }
        //then
        Assertions.assertEquals(1000, i);
    }

    @Test
    void negativeTestSimulator() {
        //given
        Simulator simulator = new Simulator();
        //
        int i;
        for (i = 0; i < 999; i++) {
            simulator.simulate();
        }
        //then
        Assertions.assertEquals(999, i);
    }
    @Test
    void negativeTestSimulator2() {
        //given
        Simulator simulator = new Simulator();
        //
        int i;
        for (i = 0; i < 1001; i++) {
            simulator.simulate();
        }
        //then
        Assertions.assertEquals(1001, i);
    }


    }
