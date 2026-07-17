package exercicio_28;

import java.sql.SQLException;

public class BancoFicticio {
    public void conectar(){
        System.out.println("Abrindo conexão.");
    }

    public void executarConsulta() throws SQLException {
        System.out.println("Executando Consulta...");
        throw new SQLException("Erro ao executar consulta.");
    }

    public void fecharConexao(){
        System.out.println("Conexão fechada.");
    }
}
