package hari2;

public class MethodReturnValue {
    public static void main(String[] args) {
        System.out.println(sum(100, 120));

        System.out.println(hitung(100,"-", 20));
        System.out.println(hitung(100,"+", 50));
        System.out.println(hitung(100,"salah", 50));
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static int hitung(int value1, String operasi, int value2) {
        int total = switch (operasi) {
            case "+":
                yield value1 + value2;
            case "-":
                yield value1 - value2;
            default:
                yield 0;
        };

        return total;
    }
}
