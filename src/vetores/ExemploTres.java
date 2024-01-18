package vetores;

public class ExemploTres {
    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        // Utilizando for:
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        // Utilizando for-each:
        // Leitura -> Para cada objeto obj contido no vetor vect, faça:
        for (String obj : vect) {
            System.out.println(obj);
        }

    }
}
