package stream.application;

import stream.entities.People;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExampleOne {
    public static void main(String[] args) {
        /* Exemplo 1 - Usando filter()
        * Filtra elementos de uma coleção com base em determinados critérios usando o método "filter()". */
        List<String> names = Arrays.asList("Maria", "José", "Elaine", "Carlos", "Marcelo");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("M"))
                .toList();
        filteredNames.forEach(System.out::println);

        /* Exemplo 2 - Usando map()
        * Mapeia elementos de uma coleção para um novo conjunto de valores usando o método "map()". */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> numbersMap = numbers.stream()
                .map(number -> number * 2)
                .toList();
        numbersMap.forEach(System.out::println);

        /* Exemplo 3 - Usando sorted()
        * Classifica os elementos de uma coleção com base em uma determinada ordem usando o método "sorted()". */
        List<Double> numbers2 = Arrays.asList(4.5, 6.7, 8.9, 2.3);
        System.out.println("Before sorted: ");
        numbers2.forEach(System.out::println);
        List<Double> numbers2Sorted = numbers2.stream()
                .sorted()
                .toList();
        System.out.println("After sorted: ");
        numbers2Sorted.forEach(System.out::println);

        /* Exemplo 4 - Usando groupingBy()
        * Agrupa elementos de uma coleção com base em uma propriedade comum usando o método "groupingBy()". */
        List<People> people = Arrays.asList(
                new People("Maria", 28),
                new People("José", 31),
                new People("Isabela", 28),
                new People("Alessandra", 22),
                new People("Evandro", 22),
                new People("Rafaela", 26)
        );
        Map<Integer, List<People>> peopleByAge = people.stream()
                .collect(Collectors.groupingBy(People::getAge));
        peopleByAge.forEach((age, peopleWithSameAge) -> {
            System.out.println("Idade: " + age);
            peopleWithSameAge.forEach(person -> System.out.println("- " + person.getName()));
            System.out.println();
        });

        /* Exemplo 5 - Usando reduce()
        * Reduz uma coleção de elementos a um único valor usando o método "reduce()". */
        List<Integer> numbers3 = Arrays.asList(3, 4, 5, 6, 7, 8, 9);
        int sum = numbers3.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);

        /* Exemplo 6 - Usando parallelStream e forEach()
        * Realiza operações em paralelo em uma coleção de elementos usando os métodos "parallelStream()" e "forEach()". */
        List<String> animals = Arrays.asList("Girafa", "Papagaio", "Elefante", "Zebra");
        animals.parallelStream()
                .forEach(animal -> System.out.println("O animal: " + animal + " - entrou no zoológico."));

    }
}
