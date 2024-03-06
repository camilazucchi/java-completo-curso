package programacaoFuncional.application;

public class Exercise {
    public static void main(String[] args) {
        executarOperacao(5, 3, soma);
        executarOperacao(5, 3, multiplicacao);
    }

    static Operacao soma = (a, b) -> {
        System.out.println("Soma: " + (a + b));
    };

    static Operacao multiplicacao = (a, b) -> {
        System.out.println("Multiplicação: " + (a * b));
    };

    // Função que recebe uma função como parâmetro:
    static void executarOperacao(int a, int b, Operacao operacao) {
        operacao.operar(a, b);
    }

    // Interface funcional que define o contrato das funções que serão passadas como parâmetro:
    interface Operacao {
        void operar(int a, int b);
    }
}
