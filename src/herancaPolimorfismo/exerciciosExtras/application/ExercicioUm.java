package herancaPolimorfismo.exerciciosExtras.application;

import herancaPolimorfismo.exerciciosExtras.entities.Carro;
import herancaPolimorfismo.exerciciosExtras.entities.Moto;
import herancaPolimorfismo.exerciciosExtras.entities.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        /* Exercício 1: (Fonte do enunciado: ChatGPT)
        * Crie uma classe chamada "Veiculo" com os seguintes atributos: "marca" e "modelo". Em seguida, crie duas
        * classes derivadas chamadas "Carro" e "Moto" que herdam de "Veiculo" e adicionam atributos específicos,
        * como "numPortas" para o "Carro" e "tipoFreio" para a "Moto". Implemente métodos para exibir informações
        * específicas de cada tipo de veículo. */

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos veículos você deseja cadastrar no sistema? ");
        int numeroVeiculos = sc.nextInt();
        sc.nextLine();
        List<Veiculo> veiculos = new ArrayList<>();

        for (int i = 1; i <= numeroVeiculos; i++) {
            System.out.println("INFORMAÇÕES DO VEÍCULO #" + i);
            System.out.print("Marca do veículo: ");
            String marca = sc.nextLine();
            System.out.print("Modelo do veículo: ");
            String modelo = sc.nextLine();
            System.out.println("O veículo cadastrado é um carro ou uma moto?\nC - Carro\nM - Moto");
            char tipo = sc.next().charAt(0);
            sc.nextLine();
            if (tipo == 'C') {
                System.out.print("Insira o número de portas: ");
                int numeroPortas = sc.nextInt();
                sc.nextLine();
                veiculos.add(new Carro(marca, modelo, numeroPortas));
            } else if (tipo == 'M') {
                System.out.print("Insira o tipo de freio: ");
                String tipoFreio = sc.nextLine();
                veiculos.add(new Moto(marca, modelo, tipoFreio));
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println();
        System.out.println("VEÍCULOS CADASTRADOS NO SISTEMA: ");
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.mostraVeiculo());
        }

        sc.close();

    }
}
