package exercicio_25;

public class Main {
    public static void main(String[] args) {
        int[] contagem = {1, 2, 3};
        int valorMaximo = 5;

        try {
            for (int i = 0; i < valorMaximo; i++) {
                System.out.println("Contagem " + contagem[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(" - -- Contagem inválido -- -");
        }
    }
}
