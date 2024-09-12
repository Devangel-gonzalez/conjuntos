import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    // Regresa el conjunto resultante de la unión de a y b
    static Set<String> union(Set<String> a, Set<String> b) {
        Set<String> resultado = new HashSet<>(a);
        resultado.addAll(b);
        return resultado;
    }

    // Regresa el conjunto resultante de la unión de a y b
    static Set<String> intersect(Set<String> a, Set<String> b) {
        Set<String> resultado = new HashSet<>(a);
        resultado.retainAll(b);
        return resultado;
    }

    // Regresa el conjunto resultante de la diferencia de a - b
    static Set<String> diff(Set<String> a, Set<String> b) {
        Set<String> resultado = new HashSet<>(a);
        resultado.removeAll(b);
        return resultado;
    }

    // Regresa verdadero si b es subconjunto de a. Falso en caso contrario.
    static boolean isSubset(Set<String> a, Set<String> b) {
        return a.containsAll(b);
    }

    // Regresa el conjunto de pares ordenados que resultan del producto cartesiano a
    // X b
    static Set<String> cartesiano(Set<String> a, Set<String> b) {
        Set<String> resultado = new HashSet<>();
        for (Object elemA : a) {
            for (Object elemB : b) {
                resultado.add("(" + elemA + ", " + elemB + ")");
            }
        }
        return resultado;

    }
}
