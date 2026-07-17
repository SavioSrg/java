package exercicio_29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ModeloB {
    public static void main(String[] args) {
        try {
            lerArquivo("/arquivo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erro ao ler arquivo");
        }
    }

    public static void lerArquivo(String nomeArquivo) throws FileNotFoundException {
        FileInputStream arquivo = new FileInputStream(nomeArquivo);
    }
}
