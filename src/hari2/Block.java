package hari2;

// block ditandai dengan {}
public class Block {
    public static void main(String[] args) { // pembuka block

        var nilai = 100; // expression

        System.out.println(nilai); // statement

        // block di dalam block digunakan sebagi grouping agar memudahkan pembacaan kode
        {
            System.out.println("Hallo dunia 1");
            System.out.println("Hallo dunia 2");
            System.out.println("Hallo dunia 3");
            {
                System.out.println("Hallo dunia 4");
                System.out.println("Hallo dunia 5");
                System.out.println("Hallo dunia 6");
            }
        }

    } // penutup block
}
