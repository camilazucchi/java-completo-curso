package stream.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleTwo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        /* O "map" é uma operação intermediária que transforma a lista. Ele pega cada elemento "x" da nossa lista e
        * transforma em outro elemento conforme definição na expressão lambda. */
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        /* Há dois métodos para mostrar os elementos da lista:
        * 1. st1.forEach(System.out::println);
        * 2. System.out.println(Arrays.toString(st1.toArray()));
        * A diferença é que o método 1 itera sobre todos os elementos na coleção "st1" e aplica a ação
        * "System.out::println" a cada elemento. Isso significa que cada elemento será impresso em uma nova linha no
        * console.
        * Já o método 2, converte a coleção "st1" em um array usando "toArray()" e, em seguida, usa "Arrays.toString()"
        * para imprimir uma representação de string do array no console. Isso resulta em uma única linha de saída, onde
        * todos os elementos são impressos em uma linha, separados por vírgulas e envolvidos por colchetes. */
        System.out.println(Arrays.toString(st1.toArray()));
    }
}
