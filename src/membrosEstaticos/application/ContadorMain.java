package membrosEstaticos.application;

import membrosEstaticos.util.Contador;

public class ContadorMain {
    public static void main(String[] args) {
        /* Crie uma classe "Contador" com um membro estático para contar o número de instâncias criadas da classe.
        * Implemente métodos para incrementar e obter o valor do contador. Teste a classe em um programa principal. */
        Contador contador1 = new Contador();
        Contador contador2 = new Contador();
        Contador contador3 = new Contador();

        System.out.println(Contador.getContadorInstancias());
    }
}
