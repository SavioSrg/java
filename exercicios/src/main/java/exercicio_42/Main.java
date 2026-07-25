package exercicio_42;

public class Main {
    public static void main(String[] args) {
        String s = "fj12";
        s.replaceAll("1", "2");

        System.out.println("Resultado 1: " + s);

        s = s.replaceAll("1", "2");
        System.out.println("Resultado 2: " + s);
    }
}
