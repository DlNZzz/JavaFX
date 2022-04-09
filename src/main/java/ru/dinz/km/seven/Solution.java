package ru.dinz.km.seven;

import java.util.function.Predicate;

/*
Даны 3 массива размерностями n1,n2,n3.
Написать программу, которая вычисляет сумму в первом массиве, максимум во втором, минимум в третьем.
Использовать потоки.
 */
public class Solution {

    private static int[] array = new int[] {234, 28734, -567, 2349811, 3, 54, -23, 534, 534, 987, 7, 4659823, 86877, 6875, 47, 6545, 754328745};
    private static int[] array2 = new int[] {867234, -564433, 567, 23411, 3, 54, 23, 534, 534, 987, -87, 426573, 867, 65, 874, 6545, 75474, 425, 3245};
    private static int[] array3 = new int[] {238674, 568743, 234, 567, 25234, -534, 987, 890, 545, 468755, 17, 423, -867, 65, 84, 6545, 75474, 425, 3245};

    public static void main(String[] args) {
        new Max(array).start();
        new Min(array2).start();
        new Sum(array3).start();
    }
}
