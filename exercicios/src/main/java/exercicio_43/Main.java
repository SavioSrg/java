package exercicio_43;

public class Main {
    public static void main(String[] args) {
        User usuario = new User("Gustavo", "gustavo.oliveira@gmail.com");

        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Nome na plataforma: " + usuario.getEmail().substring(0, usuario.getEmail().indexOf("@")));
        System.out.println("Email: " + usuario.getEmail());
    }
}
