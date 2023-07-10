package hari2;

public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(10));
        System.out.println(factorialRecursive(10));
    }
    // factorial loop
    static int factorialLoop(int value) {
        int result = 1;

        for (int counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
    }
    // factorial recursive method
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value-1);
        }
    }

}
