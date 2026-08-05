package exercicio_53;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String texto = "Ana , Pedro  ,  Maria <b>Item 1</b> e <b>Item 2</b> erro: erro no sistema";

        String[] nomes = texto.split("\\s*,\\s*");

        for(String nome : nomes){
            System.out.println(nome);
        }

        System.out.println(texto.replaceAll("\\b[A-Z][a-z]+\\b", "USUARIO"));

        Pattern pattern = Pattern.compile("<b>(.*?)</b>");
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println(matcher.group());   // <b>Item 1</b>
            System.out.println(matcher.group(1));  // Item 1
        }

        pattern = Pattern.compile("(\\w+):\\s+\\1");
        matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
