package exercicio_18.app;

import exercicio_18.model.Cliente;
import exercicio_18.model.TipoCliente;
import exercicio_18.model.TipoPagamento;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Alice", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        System.out.println(cliente);

        System.out.println(cliente.getTipoPagamento().calcularDesconto(1500));

        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelato("Pessoa física");
        System.out.println(tipoCliente);

    }
}
