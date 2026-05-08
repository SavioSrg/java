package exercicio_16.model;

public class Seguro {
    private String beneficiario;
    protected double valor;

    public Seguro(String beneficiario, double valor) {
        this.beneficiario = beneficiario;
        this.valor = valor;
    }

    public final double calcularTaxaFixa() {
        return 50.00;
    }
}
