package exercicio_47;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String texto = "O gato pulou o muro quando viu o gatilho da armadilha.";
        String regex = "\\bgato\\b";

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
