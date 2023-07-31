package Homework3;

import java.util.Comparator;

public class Product implements Comparable<Product> {

    private String name;
    private int size;
    private int weight;


    // Конструктор экземляра типа product
    public Product(String name, int size, int weight) {
        if (size <= 0 || weight <= 0) {
            throw new IllegalArgumentException("Размер и вес товара должны быть больше нуля.");
        }
        this.name = name;
        this.size = size;
        this.weight = weight;

    }

    /**
     * Геттер для размера
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Переопределение метода toString
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Имя товара: ");
        sb.append(name);
        sb.append("; ");
        sb.append("Размер товара: ");
        sb.append(size);
        sb.append("; ");
        sb.append("Вес товара: ");
        sb.append(weight);
        return sb.toString();
    }

    /**
     * Перепределение метода compareTo
     * для выполнения сортировки по весу
     */
    @Override
    public int compareTo(Product other) {
        return this.weight - other.weight;
    }

}