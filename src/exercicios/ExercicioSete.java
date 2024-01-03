package exercicios;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        /* Faça um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que
        * recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário,
        * com duas casas decimais. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your employee number ");
        int employeeNumber = sc.nextInt();
        System.out.println("Employee " + employeeNumber + ", enter the total hours worked: ");
        int hoursWorked = sc.nextInt();
        System.out.println("Employee " + employeeNumber + ", enter the hourly age: ");
        double hourlyRate = sc.nextDouble();

        double calculatedSalary = hoursWorked * hourlyRate;

        System.out.printf("Employee number: %d%nSalary: U$ %.2f%n", employeeNumber, calculatedSalary);

        sc.close();
    }
}
