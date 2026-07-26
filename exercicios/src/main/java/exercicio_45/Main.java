package exercicio_45;

public class Main {
    public static void main(String[] args) {
        int  contador = 30_000;
        System.out.println("Contador: " + contador);

        long inicio = System.currentTimeMillis();
        String texto = "";
        for(int i = 0; i < contador; i++){
            texto += i + ",";
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo total (String): " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        StringBuilder textoBuilder = new StringBuilder();
        for(int i = 0; i < contador; i++){
            textoBuilder.append(i + ",");
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo total (StringBuilder): " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        StringBuffer textoBuffer = new StringBuffer();
        for(int i = 0; i < contador; i++){
            textoBuffer.append(i + ",");
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo total (StringBuffer): " + (fim - inicio) + "ms");
    }
}
