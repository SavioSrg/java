package exercicio_22.model;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom(){
        System.out.println("O cachorro " + getNome() + " latindo!");
    }
}
