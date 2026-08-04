package exercicio_49;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String texto = "foto.png, relatorio.pdf, script.sh, gato, gatilho pdf";

        String capturarPngPdf = "\\b\\S+\\.(png|pdf)";
        String capturarSequencia = "[^aeiouAEIOU0-9]+";
        String capturarGato = "\\bgato\\b";

        Pattern pattern = Pattern.compile(capturarPngPdf);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println("Posição inicial: " + matcher.start());
        }

        pattern = Pattern.compile(capturarSequencia);
        matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        pattern = Pattern.compile(capturarGato);
        matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
