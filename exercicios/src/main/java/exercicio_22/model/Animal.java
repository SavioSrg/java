package exercicio_22.model;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void emitirSom(){
        System.out.println("Som emitido");
    }

    public static void correr(Animal animal){
        if(animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("O cachorro " + cachorro.getNome() + " fugiu!");
        } else {
            System.out.println("Fugiu!");
        }
    }
}
