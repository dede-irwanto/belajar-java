package hari2;

public class ForEach {
    public static void main(String[] args) {
        String[] names = {
                "Dede", "Irwanto", "Eka", "Wuryandari", "Potabuga"
        };

        // tanpa for each
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // dengan for each
        for (String name: names) {
            System.out.println(name);
        }
    }
}
