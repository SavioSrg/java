package exercicio_36;

import exercicio_36.model.Humano;
import exercicio_36.model.Pessoa;

public class Main {
    public static void main(String[] args) {
     Pessoa pessoa = new Pessoa();
     Humano humano = new Humano();

     try {
         pessoa.pensar();
         humano.pensar();
     } catch (Exception e) {
         System.out.println(e);
     }
    }
}
