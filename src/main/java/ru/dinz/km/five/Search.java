package ru.dinz.km.five;

public class Search extends Thread {

    private int[] array;

    public Search(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            if (Solution.getNum() == array[i]) {
                System.out.println("Элемент найден");
            }
        }
    }
}
