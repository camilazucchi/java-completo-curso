package stream.application;

import stream.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        /* Fazer um programa para ler um conjunto de produtos a partir de um arquivo em formato .csv (suponha que
        * exista pelo menos um produto).
        * Em seguida, mostrar o preço médio dos produtos. Depois, mostrar os nomes, em ordem decrescente, dos produtos
        * que possuem preço inferior ao preço médio. */
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            // Pipeline para achar o preço médio de todos os produtos:
            double avg = list.stream()
                    .map(Product::getPrice)
                    .reduce(0.0, Double::sum) / list.size();
            System.out.println("Preço médio dos produtos: " + String.format("%.2f", avg));

            // Comparator para comparar os nomes dos produtos:
            Comparator<String> comp = Comparator.comparing(String::toUpperCase);
            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(Product::getName)
                    .sorted(comp.reversed())
                    .toList();
            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
