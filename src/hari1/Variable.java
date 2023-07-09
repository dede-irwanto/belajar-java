package hari1;

public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Dede Irwanto";
        System.out.println(name);

        int age = 31;
        String address = "Kotamobagu";
        System.out.println(age);
        System.out.println(address);

        name = "Eka Potabuga";
        System.out.println(name);

        // jika bingung menentukan type variable maka gunakan var

        var firstName = "Dede";
        var lastName = "Irwanto";
        var fullName = firstName + " " + lastName;
        System.out.println(fullName);

        var umur = 31;
        System.out.println(umur);

        // jika kita menginginkan value pada variable tidak dapat diubah maka gunakan final
        final var application = "Java";
        application = "PHP"; // error
    }
}
