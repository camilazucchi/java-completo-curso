package arquivos.file.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        // Instanciamos um objeto do tipo File, esse objeto encapsula o processo de acesso ao arquivo e o caminho do mesmo.
        File file = new File("in.txt");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
