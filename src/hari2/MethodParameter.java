package hari2;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Dede", "Irwanto");
        sayHello("Eka", "Potabuga");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
