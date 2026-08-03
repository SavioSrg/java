package exercicio_48;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String texto = "2026-08-03 LOG_ERROR ID:8942 Falha de conexao";

        String capturarID = "(?<=ID:)\\d{4}";
        String capturarMensagem = "LOG_ERROR";
        String capturarFalha = "Fa.ha";

        Pattern pattern = Pattern.compile(capturarID);
        Matcher matcher = pattern.matcher(texto);

        if(matcher.find()) {
            System.out.println("ID: " + matcher.group());
        }

        pattern = Pattern.compile(capturarMensagem);
        matcher = pattern.matcher(texto);

        if(matcher.find()) {
            System.out.println("Mensagem: " + matcher.group());
        }

        pattern = Pattern.compile(capturarFalha);
        matcher = pattern.matcher(texto);

        if(matcher.find()) {
            System.out.println("Falha: " + matcher.group());
        }
    }
}
