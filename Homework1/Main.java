// 1. В класс Beverage добавить поле объем (double volume), а в класс Food - масса (double weight), 
// добавить заполнение в конструктор, добавтиь их в вывод toString()
// 2. Создать наследника класса Beverage ГорячийНапиток с дополнительным полем int температура.
// 3. Создать класс ГорячихНапитковАвтомат наследник от класса ТорговыйАвтомат и реализовать 
// перегруженный метод getProduct(String name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
// 4. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
// 5. Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

package Homework1;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {

  public static void main(String[] args) {
        Product beverageProduct1 = new HotBeverage("Espresso", 40, 12, new GregorianCalendar(2023, 7, 20, 0, 0), 0.2,
            80);
        Product beverageProduct2 = new HotBeverage("Latte", 60, 10, new GregorianCalendar(2023, 7, 20, 0, 0), 0.8, 60);
        Beverage beverageProduct3 = new HotBeverage("Cappuccino", 55, 5, new GregorianCalendar(2023, 7, 20, 0, 0), 0.5,
            80);
        HotBeverage beverageProduct4 = new HotBeverage("Glasse", 70, 18, new GregorianCalendar(2023, 7, 20, 0, 0), 0.8,
            50);
        HotBeverage beverageProduct5 = new HotBeverage("Americano", 45, 13, new GregorianCalendar(2023, 7, 20, 0, 0), 0.2,
            80);
        List<Product> myList = new ArrayList<>();
        myList.add(beverageProduct1);
        myList.add(beverageProduct2);
        myList.add(beverageProduct3);
        myList.add(beverageProduct4);
        myList.add(beverageProduct5);
        Automat hbAutomat = new HotBeverageAutomat();
        hbAutomat.initProduct(myList);
        String name = "Latte";
        Double volume = 0.8;
        Integer temperature = 60;
        System.out.println(((HotBeverageAutomat) hbAutomat).getProduct(name, volume, temperature).toString());
    }
}