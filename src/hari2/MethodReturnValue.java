package hari2;

public class MethodReturnValue {
    public static void main(String[] args) {
        var result = sum(10, 10);
        System.out.println(result);
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }
}
