package ru.dinz.km.three;

import java.util.ArrayList;
import java.util.List;

public class ListStore {

    private static List<Store> list = new ArrayList<>();

    public static void add(Store store) {
        list.add(store);
    }

    public static List<Store> getList() {
        return list;
    }
}
