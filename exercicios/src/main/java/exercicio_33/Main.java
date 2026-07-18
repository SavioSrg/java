package exercicio_33;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            salvarLivro();
        } catch (ErroAoSalvarLivroException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }

    public static void persistirLivro() throws SQLException {
        throw new SQLException("ERRO");
    }

    public static void salvarLivro() {
        try {
            persistirLivro();
        } catch (SQLException e) {
            throw new ErroAoSalvarLivroException(
                    "Erro ao salvar os dados do livro!",
                    e
            );
        }
    }
}

