package abstractMethods.exercicios.application;

import abstractMethods.exercicios.entities.Pessoa;
import abstractMethods.exercicios.entities.PessoaFisica;
import abstractMethods.exercicios.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Digite o número de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do contribuinte #" + i + ": ");
            System.out.print("Pessoa física ou pessoa jurídica (F/J)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = sc.nextDouble();
            if (ch == 'F') {
                System.out.print("Insira os gastos com saúde: ");
                double gastosSaude = sc.nextDouble();
                pessoas.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            } else {
                System.out.print("Quantos funcionários sua empresa emprega atualmente? ");
                int numeroFuncionarios = sc.nextInt();
                pessoas.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
            }
        }

        System.out.println();
        System.out.println("TOTAL DE IMPOSTOS INDIVIDUAIS: ");
        double totalImpostos = 0.0;
        for (Pessoa pessoa : pessoas) {
            double impostoIndividual = pessoa.calculaImposto();
            totalImpostos += impostoIndividual;
            System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", impostoIndividual));
        }
        System.out.println("TOTAL DE IMPOSTOS EM CONJUNTO: $ " + String.format("%.2f", totalImpostos));

        sc.close();

    }
}
