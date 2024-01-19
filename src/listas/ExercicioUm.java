package listas;

import listas.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        /* 1. Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salário) de N funcionários.
        * Não deve haver repetição de id. Em seguida, efetuar o aumento de X por cento no salário de um determinado
        * funcionário. Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
        * mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme exemplos.
        * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado livremente.
        * Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada. */

        Scanner userInput = new Scanner(System.in);
        int n;
        List<Employee> employeesList = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        n = userInput.nextInt();

        for (int i = 0; i < n; i++) {
            // Espaço:
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ": ");
            System.out.println("Id: ");
            int id = userInput.nextInt();
            System.out.println("Name: ");
            // Quebra de linha pendente:
            userInput.nextLine();
            String name = userInput.nextLine();
            System.out.println("Salary: ");
            double salary = userInput.nextDouble();

            Employee employee = new Employee(id, name, salary);

            employeesList.add(employee);
        }

        System.out.println("Enter the employee id that will have a salary increase: ");
        int idSalary = userInput.nextInt();
        Employee employee = employeesList.stream().filter(e -> e.getId() == idSalary).findFirst().orElse(null);
        if (employee == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = userInput.nextDouble();
            employee.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee e : employeesList) {
            System.out.println(e);
        }

        userInput.close();

    }
}
