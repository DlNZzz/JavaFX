package ru.dinz.km.three;

import javafx.scene.control.TextField;

//названия товара, цены товара, количество товара
/*
Создайте Windows Forms приложения с полями для ввода названия товара, цены товара, количество товара, а также двумя кнопками следующий заказ и итого.
При нажатии на первую кнопку поля ввода очищаются и заказ добавляется в список заказов.
При нажатии на итого выводится в диалоговом окне информация обо всех заказах, суммах заказов и общая сумма заказов.
 */

public class Store {

    String name;
    int price;
    int count;

    public Store(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    @Override
    public String toString() {
        return name + ", " + price + "Руб., " + count + "Шт.";
    }
}
