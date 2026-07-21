package exercicio_37;

public class Main {
    public static void main(String[] args) {
        String numero = "150.75";
        String numeroPorExtenso = "quarenta";

        double numeroConvertido = Double.parseDouble(numero);
        System.out.println("Resultado 1: " + numeroConvertido);

        try {
            int numeroPorExtensoConvertido = Integer.parseInt(numeroPorExtenso);
            System.out.println("Resultado 2: " + numeroPorExtensoConvertido);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("ERRO: Não é possivel converter.");
        }
    }

}
