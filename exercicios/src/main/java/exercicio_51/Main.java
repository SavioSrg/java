package exercicio_51;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String texto = "PROD-99";
        String verificacao = "^[A-Z]{4}-\\d{2}$";

        Pattern pattern = Pattern.compile(verificacao);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
