package generics.exercicios;

public class MainBox {
    public static void main(String[] args) {
        // Criando uma instância da classe Box para armazenar uma String:
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Olá, mundo!");

        // Recuperando e imprimindo o valor armazenado na caixa de String:
        String stringValue = stringBox.getValue();
        System.out.println("Valor armazenado na caixa de String: " + stringValue);

        // Criando uma instância da classe Box para armazenar um Integer:
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(7);

        // Recuperando e imprimindo o valor armazenado na caixa de Integer:
        Integer integerValue = integerBox.getValue();
        System.out.println("Valor armazenado na caixa de Integer: " + integerValue);
    }
}
