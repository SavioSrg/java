package exercicio_30.model;

public class LeitorDeArquivos implements AutoCloseable{
    public void abrirRecurso() {
        System.out.println("Recurso aberto.");
    }

    public void lerDados() {
        System.out.println("Lendo dados simulados...");
    }

    @Override
    public void close() {
        System.out.println("Recurso fechado automaticamente.");
    }
}
