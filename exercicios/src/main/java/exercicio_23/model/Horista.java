package exercicio_23.model;

public class Horista extends Funcionario {
    private double horasTrabalhadas;
    private double horasExtras;
    private double valorHora;

    public Horista(String nome, String cpf, double horasTrabalhadas, double valorHora) {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        if (horasTrabalhadas > 40) {
            this.horasTrabalhadas = 40;
            this.horasExtras = horasTrabalhadas - this.horasTrabalhadas;
        } else  {
            this.horasTrabalhadas = horasTrabalhadas;
            this.horasExtras = 0;
        }

        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double vencimentos() {
        if (getHorasTrabalhadas() < 40) {
            return (getHorasExtras() + getHorasTrabalhadas()) * getValorHora();
        } else {
            return ((getHorasExtras() * 1.5) + getHorasTrabalhadas()) * getValorHora();
        }
    }
}
