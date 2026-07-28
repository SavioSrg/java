package exercicio_46;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String texto = "Aprender Java e Regex no Brasil é excelente.";
        String regex = "[A-Z][a-z]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            String numero = matcher.group();
            int inicio = matcher.start();    // Índice onde começa
            int fim = matcher.end();          // Índice onde termina

            System.out.println("Encontrado: " + numero +
                    " | Índice inicial (start): " + inicio +
                    " | Índice final (end): " + fim);
        }
    }
}
