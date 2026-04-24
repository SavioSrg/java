package exercicio_06.app;

import exercicio_06.model.Student;

public class Main {
    public static void main(String[] args) {
        Student aluno = new Student();

        Student aluno2 = new Student(957, "Alice", 10.0);

        System.out.println(aluno);
        System.out.println(aluno2);
    }
}
