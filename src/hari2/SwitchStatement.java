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

        // penulisan switch case dengan lambda (hanya berjalan di java 14+)
        nilai = "C";
        switch (nilai) {
            case "A" -> System.out.println("Nilai anda istimewa");
            case "B" -> System.out.println("Nilai anda baik");
            case "C" -> System.out.println("Nilai anda cukup");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> System.out.println("Anda salah jurusan");
        }

        // kata kunci yield

        // contoh tanpa yield
        nilai = "A";
        String ucapan;

        switch (nilai) {
            case "A" -> ucapan = "Nilai anda istimewa";
            case "B" -> ucapan = "Nilai anda baik";
            case "C" -> ucapan = "Nilai anda cukup";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> ucapan = "Anda salah jurusan";
        }

        System.out.println(ucapan);

        // contoh dengan yield
        nilai = "B";
        ucapan = switch (nilai) {
            case "A":
                yield "Nilai anda istimewa";
            case "B":
                yield "Nilai anda baik";
            case "C":
                yield "Nilai anda cukup";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Anda salah jurusan";
        };

        System.out.println(ucapan);






    }
}
