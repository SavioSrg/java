package exercicio_22.model;

public class Passaro extends Animal {
    public Passaro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("O pássaro " + getNome() + " piando!");
    }
}
