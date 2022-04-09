package ru.dinz.km.seven;

import java.util.function.Predicate;

public class Max extends Thread {

    private int[] array;

    public Max(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max: " + max);
    }
}