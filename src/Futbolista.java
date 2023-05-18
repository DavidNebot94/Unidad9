package aplicacion09.pkg13;

public class Futbolista implements Comparable{

    String dni;
    String nombre;
    int edad;
    int numGoles;

    public Futbolista(String dni, String nombre, int edad, int numGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    public boolean equals(Object otro) {
        return dni.equals(((Futbolista) otro).dni);
    }

    @Override
    public int compareTo(Object otro) {
        return dni.compareTo(((Futbolista) otro).dni);
    }

    @Override
    public String toString() {
        return "\nDNI:" + dni + " nombre:" + nombre
                + " edad:" + edad + " goles:" + numGoles;
    }

}
