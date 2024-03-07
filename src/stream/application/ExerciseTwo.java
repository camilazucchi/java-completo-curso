package stream.application;

import stream.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        /* Fazer um programa para ler os dados (nome, e-mail e salário) de funcionários a partir de um arquivo em
        * formato .csv.
        * Em seguida, mostrar em ordem alfabética o e-mail dos funcionários cujo salário seja superior a um dado valor
        * fornecido pelo usuário.
        * Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file path: ");
        String path = sc.nextLine();
        System.out.println("Enter salary: ");
        double salary = sc.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Employee> employees = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            Comparator<String> comp = Comparator.comparing(String::toUpperCase);
            List<String> emails = employees.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(Employee::getEmail)
                    .sorted(comp)
                    .toList();
            System.out.println("E-mail of employees whose salary is more than " + salary);
            emails.forEach(System.out::println);

            double sum = employees.stream()
                    .filter(e -> e.getName().startsWith("M"))
                    .mapToDouble(Employee::getSalary)
                    .sum();
            System.out.println("Sum of the salary of employees whose names start with 'M': " +
                    String.format("%.2f", sum));


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
