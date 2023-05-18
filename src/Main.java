package aplicacion09.pkg13;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Futbolista[] t = new Futbolista[3];
        t[0] = new Futbolista("1", "Ramos", 30, 15);
        t[1] = new Futbolista("3", "Hazard", 25, 15);
        t[2] = new Futbolista("2", "Fekir", 28, 15);

        Arrays.sort(t, new ComparaNombres());
        System.out.println("Por nombres: " + Arrays.deepToString(t));
        System.out.println("");
        Arrays.sort(t, new ComparaEdades());
        System.out.println("Por nombres: " + Arrays.deepToString(t));
    }

}
