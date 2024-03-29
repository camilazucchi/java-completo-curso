package programacaoFuncional.application;

import programacaoFuncional.entities.Product;
import programacaoFuncional.util.PriceUpdate;
import programacaoFuncional.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;

public class PredicateExample {
    public static void main(String[] args) {
        /* Fazer um programa que, a partir de uma lista de produtos, remova da lista somente aqueles cujo preço
        * mínimo seja 100. */
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("TV", 900.0));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 350.00));
        productList.add(new Product("HD Case", 80.90));

        // Aprendemos assim antes, com um predicado na forma de expressão lambda:
        // productList.removeIf(p -> p.getPrice() >= 100.00);
        // Agora, aprendemos assim:
        // productList.removeIf(new ProductPredicate());

        // Atualiza o preço para todos os produtos:
        productList.forEach(new PriceUpdate());
        productList.forEach(System.out::println);

        // Usaremos a função map:
        /* A função “map” (não confundir com a estrutura de dados map) é uma função que aplica uma função a todos os
        elementos de uma stream. */
        List<String> productsNames = productList.stream().map(new UpperCaseName()).toList();
        /* Acima, convertemos a lista para stream e convertemos novamente para lista usando "toList()". */
        productsNames.forEach(System.out::println);


    }
}
