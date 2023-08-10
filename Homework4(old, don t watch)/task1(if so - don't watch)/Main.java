package Homework4.task1;

public class Main {
    public static <T> void printElement(T element) {
        System.out.println(element);
    }

    public static void main(String[] args) {
        Integer num = 10;
        String str = "Hello";
        Double db = 3.14;

        printElement(num);
        printElement(str);
        printElement(db);
    }
}
