package poo.application;

import poo.entities.Student;

import java.util.Scanner;

public class MainExercicioTres {
    public static void main(String[] args) {
        /* Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
        * (primeiro trimestre vale 30, o segundo e o terceiro valem 35 cada). Ao final, mostrar qual a nota final do
        * aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos
        * pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da nota). */
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Please enter the student name: ");
        student.name = sc.nextLine();

        System.out.println("Please enter the student's first grade: ");
        student.grade1 = sc.nextDouble();

        System.out.println("Please enter the student's second grade: ");
        student.grade2 = sc.nextDouble();

        System.out.println("Please enter the student's third grade: ");
        student.grade3 = sc.nextDouble();

        student.showFinalGrade();

        sc.close();
    }
}
