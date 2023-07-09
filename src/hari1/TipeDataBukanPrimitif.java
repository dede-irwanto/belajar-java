package hari1;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;
        System.out.println(iniByte);

        // konversi tipe data primitif ke bukan primitif
        int iniInt = 100;
        Integer iniObject = iniInt;

        // konversi tipe data bukan primitif ke primitif
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

    }
}
