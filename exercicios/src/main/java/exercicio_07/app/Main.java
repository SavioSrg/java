package exercicio_07.app;

import exercicio_07.model.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle retangulo = new Rectangle(12.5, 23);

        Rectangle retangulo2 = new Rectangle(retangulo);

        System.out.println(retangulo);
        System.out.println(retangulo2);
    }
}
