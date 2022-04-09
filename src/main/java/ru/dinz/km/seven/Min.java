package ru.dinz.km.seven;

public class Min extends Thread {

    private int[] array;

    public Min(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min: " + min);
    }
}
