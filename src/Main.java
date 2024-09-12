import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<String> letras = new HashSet<String>();
        HashSet<String> numeros = new HashSet<String>();

        letras.add("a");
        letras.add("b");
        letras.add("c");

        numeros.add("1");
        numeros.add("2");
        numeros.add("3");

        Set<String> x = null;
        x = SetOperations.union(letras, numeros);
        System.out.println("Unión: " + x);

        x = SetOperations.intersect(letras, numeros);
        System.out.println("Intersección: " + x);

        x = SetOperations.diff(letras, numeros);
        System.out.println("Diferencia: " + x);

        System.out.println("¿b es conjunto de a?: " + SetOperations.isSubset(letras, numeros));

        x = SetOperations.cartesiano(letras, numeros);
        System.out.println("Cartesiano: " + x);

    }
}
