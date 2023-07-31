package Homework3;

import Homework3.IStockBehavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stock implements IStockBehavior {


    private List<Product> items;

    // Конструктор для инициализации списка товаров при создании объекта Stock
    public Stock() {
        items = new ArrayList<>();
    }

    /**
     * Метод имитирующий добавление товара на склад
     *
     */
    @Override
    public void putProduct(Product product) {
        items.add(product);
    }

    /**
     *
     * Метод имитирующий удаление товара со склада
     */
    @Override
    public void removeProduct(Product product) {
        items.remove(product);
    }


    /**
     * Метод проверки состояния склада
     */

    @Override
    public void checkStatus() {
        System.out.println("На данный момент на складе " + items.size() + " позиций");
    }

    /**
     * Метод проверки наличия продукта на складе
     */
    public boolean contains(Product product) {
        return items.contains(product);
    }

    /**
     * Реализация метода сортировки по весу
     */
    public void sortedByWeight() {
        Collections.sort(items);
        for (Product product:items) {
            System.out.println(product);
        }
    }

    /**
     * Реализация метода сортировки по размеру
     * Создаем новый экземпляр функционального интерфейса типа Copmorator
     * с помощью лямбды выражение сортируем список, далее выводим его на экран
     */
    public void sortBySize() {
        Comparator<Product> comparator = (product1, product2) -> product1.getSize() - product2.getSize();
        Collections.sort(items, comparator);
        for (Product product : items) {
            System.out.println(product);
        }
    }

}
