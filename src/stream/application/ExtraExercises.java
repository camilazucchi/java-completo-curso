package stream.application;

import java.util.Arrays;
import java.util.List;

public class ExtraExercises {
    public static void main(String[] args) {
        // Exercício 1
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = integers.stream()
                .filter(i -> i % 2 == 0)
                .map(n -> n * n)
                .toList();
        System.out.println("Squared numbers: " + squaredNumbers);

        // Exercício 2
        List<String> strings = Arrays.asList("Ana", "Leandra", "Marcela", "Eduarda", "Aparecida");
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.startsWith("A"))
                .map(String::toUpperCase)
                .toList();
        System.out.println("Filtered strings: " + filteredStrings);
    }
}
