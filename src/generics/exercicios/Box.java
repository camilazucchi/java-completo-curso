package generics.exercicios;

public class Box <T> {
    private T value;

    // Método para definir o valor armazenado na caixa:
    public void setValue(T value) {
        this.value = value;
    }

    // Método para recuperar o valor armazenado na caixa:
    public T getValue() {
        return value;
    }
}