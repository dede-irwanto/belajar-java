package hari2;

public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "E";

        switch (nilai) {
            case "A":
                System.out.println("Nilai anda istimewa");
                break;
            case "B":
                System.out.println("Nilai anda baik");
                break;
            case "C":
                System.out.println("Nilai anda cukup");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda salah jurusan");
        }

        // gaya lain penulisan switch case (hanya berjalan di java 14+
        var nilai2 = "C";
        switch (nilai2) {
            case "A" -> System.out.println("Nilai anda istimewa");
            case "B" -> System.out.println("Nilai anda baik");
            case "C" -> System.out.println("Nilai anda cukup");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> System.out.println("Anda salah jurusan");
        }
    }
}
