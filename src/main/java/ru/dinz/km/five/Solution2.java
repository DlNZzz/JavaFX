package ru.dinz.km.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = reader.readLine();
            String reg = reader.readLine();
            System.out.println(str.split(reg).length > 1 ? str.split(reg)[1] : "Нет REG");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
