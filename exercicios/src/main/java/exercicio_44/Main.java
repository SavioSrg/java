package exercicio_44;

public class Main {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println("Valor B está usando a referencia de memória do Valor A, " +
                "O valor C força instanciar como um valor novo e fica fora do Strings Pool");

        System.out.println("Comparação (==): " + (a == b));
        System.out.println("Comparação (==): " + (a == c));

        System.out.println("Comparação (equals): " + (a.equals(b)));
        System.out.println("Comparação (equals): " + (a.equals(c)));

    }
}
