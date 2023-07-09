package hari1;

public class Array {
    public static void main(String[] args) {
        // penulisan array dengan deklarasi jumlah array
        String[] stringArray;
        stringArray = new String[3];

        // atau
        String[] stringArray2 = new String[3]; //

        // mengisi value pada array
        stringArray[0] = "Dede";
        stringArray[1] = "Irwanto";

        // pemanggilan array
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);

        stringArray[0] = "Aldo";
        System.out.println(stringArray[0]);


        // penulisan array tanpa mendeklarasikan jumlah array
        String[] namaNama = {
                "Dede", "Irwanto", "Eka", "Potabuga"
        };

        // atau
        int[] arrayInt = new int[] {
                1,2,3,4,5,6,7,8,9,10
        };

        // hitung jumlah array
        System.out.println(namaNama.length);

        // mengosongkan data array
        namaNama[1] = null;
        System.out.println(namaNama[0]);
        System.out.println(namaNama[1]);
        System.out.println(namaNama[2]);
        System.out.println(namaNama[3]);

        // array di dalam array
        String[][] members = {
                {"Dede", "Irwanto"},
                {"Eka", "Wuryandari", "Potabuga"},
                {"Adeeva", "Dhiyaulhaq", "Jennaira"},
                {"Nazeefa", "Qotrunnada", "Salsabila"},
                {"Razeeta", "Jihan", "Syauqiah"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][2]);
        System.out.println(members[2][2]);
        System.out.println(members[3][2]);
        System.out.println(members[4][2]);
    }
}
