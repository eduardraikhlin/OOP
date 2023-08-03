package Homework4.task2;

public class Main {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};
        printArray(integerArray);

        String[] stringArray = {"Apple", "Banana", "Orange"};
        printArray(stringArray);
    }
}
