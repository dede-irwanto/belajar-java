package hari1;

public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        // Widening Casting (Otomatis): byte -> short -> int -> long -> float -> double
        int iniInteger = 10;
        long iniLong = iniInteger;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        // Narrowing Casting (Manual): double -> float -> long -> int -> short -> byte
        int iniInteger2 = (int) iniDouble;
    }
}
