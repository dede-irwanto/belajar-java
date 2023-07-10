package hari2;

public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {80, 75, 60, 85, 70};
        sayCongrats("Dede", values);

        sayCongrats2("Eka", 75, 80, 90, 100, 65);
    }

    // method tanpa variable argument
    static void sayCongrats(String name, int[] values) {
        var total = 0;

        for (var value: values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda lulus!");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak lulus!");
        }

    }

    // method dengan variable argument
    static void sayCongrats2(String name, int... values) {
        var total = 0;

        for (var value: values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda lulus!");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak lulus!");
        }

    }

}
