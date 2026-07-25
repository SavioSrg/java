package exercicio_43;

public class User {
    private String nome;
    private String email;

    public User(String nome, String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("ERRO: Email está vazio.");
        }

        if (email.indexOf("@") == -1) {
            throw new IllegalArgumentException("ERRO: Email inválido.");
        }

        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
