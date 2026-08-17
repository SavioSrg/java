package exercicio_59.app;

import exercicio_59.model.Aluno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Ana", 8.5);
        Aluno b = new Aluno("James", 9.5);
        Aluno c = new Aluno("Carlo", 12.5);
        Aluno d = new Aluno("Biel", 9.5);
        Aluno e = new Aluno("Eric", 8.5);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        alunos.add(d);
        alunos.add(e);

        alunos.sort(
                Comparator.comparing(Aluno::getNota) //Compara pela nota
                .reversed()                          //Inverte para o maior primeiro
                .thenComparing(Aluno::getNome));     //Se empatar, comparar os nomes

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }



    }
}
