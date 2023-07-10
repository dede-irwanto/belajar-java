package hari2;

public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String ucapan;

        // tanpa ternary operator
        if (nilai >= 75) {
            ucapan = "Selamat anda lulus";
        } else {
            ucapan = "Anda tidak lulus";
        }

        System.out.println(ucapan);


        // dengan ternary operator
        String ucapan2 = nilai >= 80 ? "Selamat anda lulus" : "Anda tidak lulus";

        System.out.println(ucapan2);
    }
}
