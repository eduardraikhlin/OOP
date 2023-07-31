package Homework3;

import Homework3.IQueueBehavior;

import java.util.LinkedList;
import java.util.Queue;

public class MarketQueue implements IQueueBehavior {

    private Queue<Person> people;


    // Конструктор экземпляра MarketQueue
    MarketQueue() {
        people = new LinkedList<>();
    }

    /**
     * Реализация метода проверки статуса очереди
     */
    @Override
    public void checkQueueStatus() {
        System.out.println("На данный момент в очереди " + people.size() + " человек");
    }

    /**
     * Реализация метода добавление в очередь человека
     */
    @Override
    public void putPerson(Person person) {
        if (person != null) {
            people.add(person);
        } else {
            System.out.println("Невозможно добавить null в очередь.");
        }
    }

    /**
     * Реализация метода удаления человека из очереди
     */
    @Override
    public void removePerson(Person person) {
        if (person != null) {
            people.remove(person);
            checkQueueStatus();
        } else {
            System.out.println("Невозможно удалить null из очереди.");
        }
    }
}
