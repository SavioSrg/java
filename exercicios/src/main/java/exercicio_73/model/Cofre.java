package exercicio_73.model;

public class Cofre {
    private String senhaSecreta;

    public Cofre(String senhaSecreta) {
        this.senhaSecreta = senhaSecreta;
    }

    public class Auditor {
        public void mostrarSenhaAtual(){
            System.out.println("Senha atual: " + senhaSecreta);
        }
    }

    public static class Fabricante {
        Cofre cofre;

        public Fabricante(Cofre cofre){
            this.cofre = cofre;
        }

        public void mostrarSenhaAtual(){
            System.out.println("Senha atual: " + cofre.senhaSecreta);
        }
    }
}
