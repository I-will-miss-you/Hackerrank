package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day21_Generics {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<>();
        Printer<String> stringPrinter = new Printer<>();
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        if (Printer.class.getDeclaredMethods().length > 1) {
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }

}

class Printer<T> {

    public < E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.println(element);
        }
    }

}
