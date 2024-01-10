package poo.application;

import poo.entities.Employee;

import java.util.Scanner;

public class MainExercicioDois {
    public static void main(String[] args) {
        /* Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os
        * dados do funcionário (nome e salário líquido). Após isso, aumentar o salário do funcionário com base em uma
        * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do
        * funcionário. */
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Enter the employee name: ");
        employee.name = sc.nextLine();
        System.out.println("Enter the employee gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Enter the tax: ");
        employee.tax = sc.nextDouble();

        employee.netSalary();
        System.out.println(employee);

        System.out.println();
        System.out.println("Please enter the percentage to increase the employee salary: ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Updated data: \n" + employee);

        sc.close();

    }
}
