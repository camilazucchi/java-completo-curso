package listas;

import java.util.ArrayList;
import java.util.List;

public class ExemploUm {
    public static void main(String[] args) {

        // A lista, diferente do vetor, não aceita tipos primitivos! É necessário usar a wrapper class.
        // Generics "<>".
        // ArrayList implementa a interface List.
        List<String> list = new ArrayList<>();

        // Adiciona um elemento:
        list.add("Banana"); // Posição 0
        list.add("Maçã"); // Posição 1
        list.add("Morango"); // Posição 2
        list.add("Uva"); // Posição 3
        list.add("Abacate"); // Posição 4

        // Adiciona um elemento em uma posição específica da lista:
        list.add(1, "Melancia");

        // Retorna o tamanho da lista:
        System.out.println("Tamanho da lista: " + list.size());

        // Para cada "x" dentro de list, faça (imprima):
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("--------------");

        // Remove um elemento da lista:
        list.remove(2);

        // Remove elementos de acordo com um predicado:
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }

        // Encontra a posição de um elemento:
        System.out.println("Index of Banana: " + list.indexOf("Abacate"));
        System.out.println("--------------");

        // Filtra a lista:
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'U').toList();

        for (String x : result) {
            System.out.println(x);
        }


    }
}
