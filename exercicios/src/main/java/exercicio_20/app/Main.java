package exercicio_20.app;

import exercicio_20.model.Cargo;
import exercicio_20.model.Desenvolvedor;

public class Main {
    public static void main(String[] args) {

        Desenvolvedor dev = new Desenvolvedor("Sávio", Cargo.ESTAGIARIO);
        dev.setSalario(1500);

        System.out.println(dev);

        dev.subiuDeCargo(Cargo.ASSISTENTE);
        System.out.println(dev);
    }
}
