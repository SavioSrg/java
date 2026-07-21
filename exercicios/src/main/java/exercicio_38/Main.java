package exercicio_38;

public class Main {
    public static void main(String[] args) {
        Long contadorA = 0L;
        long contadorB = 0L;

        long tempoInicialA = System.nanoTime();

        for (int i = 1; i <= 10000000; i++) {
            contadorA += i;
        }
        long tempoFinalA = System.nanoTime();

        long tempoTotalA = tempoFinalA - tempoInicialA;
        System.out.println("Tempo de execução (Long): " + tempoTotalA + " nanosegundos.");

        long tempoInicialB = System.nanoTime();

        for (int i = 1; i <= 10000000; i++) {
            contadorB += i;
        }
        long tempoFinalB = System.nanoTime();

        long tempoTotalB = tempoFinalB - tempoInicialB;
        System.out.println("Tempo de execução (long): " + tempoTotalB + " nanosegundos.");

    }
}
