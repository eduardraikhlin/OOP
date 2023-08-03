package Homework4.task4;

public class Main {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>();
        container.add("Apple");
        container.add("Banana");
        container.add("Orange");

        container.print();

        container.sort((s1, s2) -> s2.compareTo(s1));

        container.print();
    }
}
