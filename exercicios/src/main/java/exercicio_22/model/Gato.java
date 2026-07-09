package exercicio_22.model;

public class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("O gato " + getNome() + " miando!");
    }
}
