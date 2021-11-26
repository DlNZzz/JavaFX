package ru.dinz.km.three;

import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation<T> implements Math<T> {

    private List<T> list;

    public QuadraticEquation(List<T> list) {
        this.list = list;
    }

    @Override
    public String decide() {
        var listInt = listInteger();
        int a, b, c;
        String s = "Введите 3 параметра";
        if (listInt.size() == 3) {
            s = "";
            a = listInt.get(0);
            b = listInt.get(1);
            c = listInt.get(2);
            if (a == 0) {
                if (b != 0) {
                    s += String.format("x1 = %s", -c / b);
                } else {
                    s += "корней нет";
                }
            } else {
                int d = b * b - 4 * a * c;
                if (d < 0) {
                    s += "корней нет";
                } else {
                    double x1, x2;
                    x1 = (-b + java.lang.Math.sqrt(d)) / (2 * a);
                    if (d == 0) {
                        s += String.format("Корни одинаковые x1 = %s", x1);
                    } else {
                        x2 = (-b - java.lang.Math.sqrt(d)) / (2 * a);
                        s += String.format("x1 = %s\nx2 = %s", x1, x2);
                    }
                }
            }
        }
        return s;
    }

    @Override
    public boolean isInt(T x) {
        if (x == null) {
            return false;
        }
        try {
            Integer.parseInt(String.valueOf(((TextField) x).getCharacters()));
            return true;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Integer> listInteger() {
        List<Integer> listInt = new ArrayList<>();
        for (T t : list) {
            if (isInt(t)) {
                listInt.add(Integer.parseInt(String.valueOf(((TextField) t).getCharacters())));
            }
        }
        return listInt;
    }
}
