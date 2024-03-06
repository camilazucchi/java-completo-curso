package programacaoFuncional.application;

import programacaoFuncional.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Apple Watch", 350.00));

        /* Essa linha de código está ordenando a lista de produtos ("list") com base no nome dos produtos, ignorando
        * maiúsculas e minúsculas. */
        list.sort(Comparator.comparing((p -> p.getName().toUpperCase())));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}