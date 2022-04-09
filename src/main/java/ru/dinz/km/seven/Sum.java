package ru.dinz.km.seven;

public class Sum extends Thread {

    private int[] array;

    public Sum(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum: " + sum);
    }
}
