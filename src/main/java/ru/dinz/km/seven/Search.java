package ru.dinz.km.seven;

public class Search extends Thread {

    private int num;

    public Search(int num) {
        this.num = num;
    }

    public void run() {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
