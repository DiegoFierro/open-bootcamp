import java.util.*;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche(4);
        System.out.println(miCoche.puertas);
        System.out.println(miCoche.incrementarPuertas());
        
    }
}

public class Coche {
    int puertas;

    public Coche (int puertas) {
        this.puertas = puertas;
    }

    public int incrementarPuertas(){
        return (puertas + 1);
    }

}
