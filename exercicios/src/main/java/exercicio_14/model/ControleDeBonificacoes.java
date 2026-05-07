package exercicio_14.model;

import java.util.ArrayList;
import java.util.List;

public class ControleDeBonificacoes {
    private double totalDeBonificacoes = 0;
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void registra(Funcionario f) {
        this.funcionarios.add(f);
        this.totalDeBonificacoes += f.getBonificacao();
    }

    public double getTotalDeBonificacoes() {
        return totalDeBonificacoes;
    }

    public void lista() {
        for (Funcionario f : funcionarios) {
            System.out.printf("Nome: %s | Salário: %.2f | Bônus: %.2f%n",
                    f.getNome(), f.getSalario(), f.getBonificacao());
        }
    }
}
