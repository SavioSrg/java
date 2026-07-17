package exercicio_28;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        BancoFicticio bd = new BancoFicticio();

        try {
            bd.conectar();
            bd.executarConsulta();

            System.out.println("Consulta executada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao acessar o banco de dados: " + e.getMessage());

        } finally {
            bd.fecharConexao();
        }
    }
}
