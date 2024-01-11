package membrosEstaticos.util;

public class Contador {

    private static int contadorInstancias = 0;

    public Contador() {
        contadorInstancias++;
    }

    public static int getContadorInstancias() {
        return contadorInstancias;
    }
}
