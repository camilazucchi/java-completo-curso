package generics.exercicios;

import java.util.List;

public class MainMaximumFinder {
    public static void main(String[] args) {
        List<Integer> intList = List.of(3, 7, 2, 9, 5);
        Integer maxInteger = MaximumFinder.findMaximum(intList);
        System.out.println("Maior elemento da lista de inteiros: " + maxInteger);

        List<Double> doubleList = List.of(3.5, 6.7, 8.9, 2.1);
        Double maxDouble = MaximumFinder.findMaximum(doubleList);
        System.out.println("Maior elemento da lista de doubles: " + maxDouble);

        List<String> stringList = List.of("Banana", "Maçã", "Morango", "Melão", "Acerola");
        String maxString = MaximumFinder.findMaximum(stringList);
        System.out.println("Maior elemento da lista de strings: " + maxString);
    }
}
