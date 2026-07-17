package exercicio_30.app;

import exercicio_30.model.LeitorDeArquivos;

public class Main {
    public static void main(String[] args) {
        try (LeitorDeArquivos leitor = new LeitorDeArquivos()) {
            leitor.abrirRecurso();
            leitor.lerDados();
        }
    }
}
