package Homework3;

import Homework3.Market;
import Homework3.Person;
import Homework3.Product;

public class Main {
    public static void main(String[] args) {
        Market market = new Market("Магазин прекрасных котиков", 10);
        market.greetings();
        Product product_01 = new Product("Пучеглазая Марсель", 10, 10);
        Product product_02 = new Product("Ласковый Барсик", 5, 5);
        Product product_03 = new Product("Добрый Васька", 2, 2);
        Product product_04 = new Product("Кориченвый Глазастик", 1, 7);
        Product product_05 = new Product("Толстенький Брюс", 3, 6);
        Product product_06 = new Product("Любознательный Томас", 7, 4);
        Person visitor_01 = new Person("Главный", "Кошатник");
        market.addProduct(product_01);
        market.addProduct(product_02);
        market.addProduct(product_03);
        market.addProduct(product_04);
        market.addProduct(product_05);
        market.addProduct(product_06);
        market.getIn();
        market.checkStockStatus();
        market.putPerson(visitor_01);
        market.giveProduct(visitor_01, product_01);
        System.out.println("Выполнение сортировки по весу товара: ");
        market.sortedProductByWeight();
        System.out.println("=".repeat(50));
        System.out.println("Выполнение сортировки по размеру товара: ");
        market.sortedProductBySize();
    }
}
