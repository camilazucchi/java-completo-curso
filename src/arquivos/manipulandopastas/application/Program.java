package arquivos.manipulandopastas.application;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Usuário digita o caminho:
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        // Uma variável do tipo File pode ser o caminho de um arquivo ou o caminho de uma pasta!
        File path = new File(strPath);

        // O array "folders" conterá todos os arquivos e diretórios encontrados no diretório especificado pelo
        // caminho "path".
        // Imprime as pastas:
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for (File folder : folders) {
            System.out.println(folder);
        }

        // Imprime os arquivos:
        File[] files = path.listFiles(File::isFile);
        System.out.println("Files: ");
        for (File file : files) {
            System.out.println(file);
        }

        sc.close();

    }
}
