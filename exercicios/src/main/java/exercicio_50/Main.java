package exercicio_50;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String texto = "CUPOM2026 color colour a ab abb abbbb";

        String capturarCupom = "CUPOM\\d{4}";
        String capturarCor = "colou?r";

        String capturar1 = "ab?"; // Deixa facultativo a letra b, é só vai imprimir no máximo ab
        String capturar2 = "ab+"; // A letra 'b' deve aparecer uma ou mais vezes.
        String capturar3 = "ab*"; // A letra 'b' pode aparecer zero ou mais vezes.

        Pattern pattern = Pattern.compile(capturarCupom);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println("Posição inicial: " + matcher.start() + "\n");
        }

        pattern = Pattern.compile(capturarCor);
        matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println("Palavra: " + matcher.group() + "\n");
        }

        pattern = Pattern.compile(capturar1);
        matcher = pattern.matcher(texto);

        System.out.println("Captura 1:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        pattern = Pattern.compile(capturar2);
        matcher = pattern.matcher(texto);

        System.out.println("\nCaptura 2:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        pattern = Pattern.compile(capturar3);
        matcher = pattern.matcher(texto);

        System.out.println("\nCaptura 3:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
