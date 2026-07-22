package exercicio_39;

public class Main {
    public static void main(String[] args) {
        Integer a1 = 100;
        Integer b1 = 100;

        System.out.println("Resultado da primeira comparação: " + (a1 == b1));
        System.out.println("Resultado da primeira comparação: " + (a1.equals(b1)));


        Integer a2 = 200;
        Integer b2 = 200;

        System.out.println("Resultado da segunda comparação: " + (a2 == b2));
        System.out.println("Resultado da segunda comparação: " + (a2.equals(b2)));

//  O Integer utiliza um cache para valores entre -128 e 127. Por isso, a1 e b1 apontam para o mesmo objeto, fazendo com que a comparação usando == retorne true.
//
//  Já o valor 200 está fora dessa faixa de cache, então a2 e b2 referenciam objetos diferentes e == retorna false.
//
//  O metodo equals () compara o conteúdo dos objetos, e não sua referências.Por isso, ele retorna true em ambos os casos.
    }
}
