package ru.dinz.km.seven;

//Написать программу для многопоточного поиска делителей числа М.

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        new Search(num).start();
    }
}
