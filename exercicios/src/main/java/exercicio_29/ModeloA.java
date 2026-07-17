package exercicio_29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ModeloA {
    public static void main(String[] args) {

        lerArquivo("/arquivo.txt");
    }
    
    public static void lerArquivo(String nomeArquivo) {
        try {
            FileInputStream arquivo = new FileInputStream(nomeArquivo);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("ERRO: Arquivo não encontrado");
        }
    }
}
