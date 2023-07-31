package Homework3;

import Homework3.IMarketBehavior;
import Homework3.IQueueBehavior;

import java.util.ArrayList;
import java.util.List;

public class Market implements IMarketBehavior, IQueueBehavior {

    private int size;
    private String name;
    private int fill;
    private MarketQueue queue;
    private Stock stock;

    // Реализация конструктора экземпляра типа Market
    public Market(String name, int size) {
        this.name = name;
        this.size = size;
        this.fill = 0;
        this.queue = new MarketQueue();
        this.stock = new Stock();
    }

    /**
     * Метод приветствия
     */
    public void greetings() {
        System.out.println("Добро пожаловать в торговую точку " + name);
    }

    /**
     * Реализация метода выдочи продукта, принимающий в себя объект типа Person и объект типа Product
     */
    public void giveProduct(Person person, Product product) {
        if (stock.contains(product)) {
            System.out.println("Просим вас уважаемый " + person + ", вот ваш товар: " + product.toString());
            stock.removeProduct(product);
            queue.removePerson(person);
        } else {
            System.out.println("Такого товара нет в наличии");
        }
    }

    /**
     * Реализация метода проверки заполненности магазина
     */
    private boolean isMarketFull() {
        return fill == size;
    }

    /**
     * Реализация метода входа в магазин человека. Если Магазин не полон, то происходит увеличение заполненности на 1.
     */
    @Override
    public void getIn() {
        if (!isMarketFull()) {
            fill++;
        } else {
            System.out.println("Извините, на данный момент в торговой точке нет места!");
        }
        update();
    }

    /**
     * Реазилация выхода из магазина. Если заполненность не равна 0, то человек покидает магазин.
     */
    @Override
    public void getOut() {
        if (fill > 0) {
            fill--;
        }
        update();
    }

    /**
     * Реализация метода обновление статуса количества человек в магазине
     */
    @Override
    public void update() {
        System.out.println("На данный момент в магазине " + fill + " человек");
    }

    /**
     * Реализация мтеода проверки статуса очереди
     */
    @Override
    public void checkQueueStatus() {
        queue.checkQueueStatus();
    }

    /**
     * Реализация метода добавления человека в очередь.
     * Выполняется проверка на заполненность магазина.
     * Если магазин не полон, то человек встаёт в очередь.
     * После выводится обновленный статус очереди.
     */
    @Override
    public void putPerson(Person person) {
        if (!isMarketFull()) {
            queue.putPerson(person);
            System.out.println(person.toString() + " встал в очередь");
        } else {
            System.out.println("Дождитесь, пока освободится очередь!");
        }
        checkQueueStatus();
    }

    /**
     * Реализация метода удаления человека из очереди.
     * Если заполненность не равна 0, то человек удаляется из очереди.
     * Происходит обновление статуста очереди.
     */
    @Override
    public void removePerson(Person person) {
        if (fill != 0) {
            queue.removePerson(person);
            System.out.println("До свидания! " + person.toString());
        }
        checkQueueStatus();
    }

    /**
     * Реализация метода добавления продукта на склад.
     */
    public void addProduct(Product product) {
        stock.putProduct(product);
    }

    /**
     * Реализация метода удаления продукта со склада
     */
    void removeProduct(Product product) {
        stock.removeProduct(product);
    }

    /**
     * Реализация метода сортировки по весу
     */
    public void sortedProductByWeight() {
        stock.sortedByWeight();
    }

    /**
     * Реализая метода сортировки по размеру
     */
    public void sortedProductBySize() { stock.sortBySize();}

    /**
     * Реализация метода провери статуса склада
     */
    public void checkStockStatus() {
        stock.checkStatus();
    }
}