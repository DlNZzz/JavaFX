package ru.dinz.km.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. Написать программу для поиска в одномерном массиве длины N некоторого числа. В программу вводится количество потоков и искомое число.
Каждый поток проверяет есть ли искомое число в своей части массива. Программа выдаёт ответ "Есть", если данное число найдено в массиве.
 */
public class Solution {

    private static int[] array = new int[] {2, 23, 53, 65, 453, 7654, 123, 423, 765, 9876, 645, 35346, 645};
    private static int threads;
    private static int num;

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            threads = Integer.parseInt(reader.readLine());
            num = Integer.parseInt(reader.readLine());
            int ar = array.length / threads;
            for (int i = 0; i < threads; i++) {
                if (i + 1 == threads) {
                    new Search(new Solution().splitArray(i * ar, array.length)).start();
                }
                new Search(new Solution().splitArray(i * ar, (i + 1) * ar)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int[] splitArray(int start, int end) {
        int[] array = new int[end - start];
        for (int i = 0; i < array.length; i++) {
            array[i] = Solution.array[start++];
        }
        return array;
    }

    public static int getNum() {
        return num;
    }
}
