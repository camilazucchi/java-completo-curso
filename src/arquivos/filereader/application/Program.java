package arquivos.filereader.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String path = "in.txt";

        // Utilizando try-with-resources, o fechamento automático dos recursos é garantido pelo Java. Não precisamos
        // mais nos preocupar em fechar explicitamente o "BufferedReader" e o "FileReader".
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
