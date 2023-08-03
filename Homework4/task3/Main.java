package Homework4.task3;

public class Main {
    public static <T extends Comparable<T>> T getMax(T value1, T value2) {
        if (value1.compareTo(value2) > 0) {
            return value1;
        } else {
            return value2;
        }
    }

    public static void main(String[] args) {
        Integer maxInteger = getMax(5, 10);
        System.out.println("Max Integer: " + maxInteger);

        Double maxDouble = getMax(3.14, 2.71);
        System.out.println("Max Double: " + maxDouble);

        String maxString = getMax("Apple", "Banana");
        System.out.println("Max String: " + maxString);
    }
}
