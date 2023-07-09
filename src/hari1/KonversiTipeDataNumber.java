package hari1;

public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        // Widening Casting (Otomatis) konversi dari size tipe data kecil ke besar: byte -> short -> int -> long -> float -> double
        int iniInt = 10;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        // Narrowing Casting (Manual) konversi dari size tipe data besar ke kecil: double -> float -> long -> int -> short -> byte
        int iniInteger2 = (int) iniDouble;
    }
}
