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
        System.out.println("Utilizando map: " + Arrays.toString(st1.toArray()));

        int sum = list.stream()
                /* O método "reduce()" pega o elemento inicial, que será o elemento neutro de operação e depois uma
                * função que recebe dois argumentos e gera um resultado. */
                .reduce(0, Integer::sum);
        System.out.println("Utilizando reduce: Sum = " + sum);

        List<Integer> newList = list.stream()
                // O método "filter()" filtra nossa lista.
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                /* O método "toList()" é um método de conveniência adicionado ao Java 16, que permite converter um
                * fluxo (stream) para uma lista diretamente, sem a necessidade de chamar explicitamente o método
                * "collect(Collectors.toList())".
                * Usar "toList()" é mais simples e reduz a quantidade de código, tornando o código mais limpo e fácil
                * de entender. Portanto, o IntelliJ sugere isso como uma prática recomendada quando estivermos
                * trabalhando com coleções em Java 16 e versões posteriores.
                * Caso estejamos usando uma versão antiga do java que não suporta "toList()", então
                * "collect(Collectors.toList())" será a opção apropriada. */
                .toList();
        System.out.println("Utilizando filter e map: " + Arrays.toString(newList.toArray()));
    }
}
