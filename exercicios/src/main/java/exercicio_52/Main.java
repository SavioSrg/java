package exercicio_52;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o seu CEP (exemplo: 3500-000)");
            String cep = input.nextLine();

            String verificarCep = "^\\d{5}(-)?\\d{3}$";
            Pattern pattern = Pattern.compile(verificarCep);
            Matcher matcher = pattern.matcher(cep);

            if (!matcher.matches()) {
                throw new IllegalArgumentException("CEP invalido");
            }

            System.out.println("Digite o seu número de telefone (exemplo: (31) 98888-7777)");
            String celular = input.nextLine();

            String verificarCelular = "^(\\(\\d{2}\\)\\s?)?\\d{4,5}-\\d{4}$";
            pattern = Pattern.compile(verificarCelular);
            matcher = pattern.matcher(celular);

            if (!matcher.matches()) {
                throw new IllegalArgumentException("Celular invalido");
            }

            System.out.println("Digite o horário do seu chamado (exemplo: 27/07/2026 14:30)");
            String horario = input.nextLine();

            String verificarHorario = "^(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/\\d{4} ([01]\\d|2[0-3]):[0-5]\\d$";
            pattern = Pattern.compile(verificarHorario);
            matcher = pattern.matcher(horario);

            if (!matcher.matches()) {
                throw new IllegalArgumentException("Horário invalido");
            }

            System.out.println("Digite o nome de usuário com tamanho entre 6 e 12 caracteres:");
            String loginUser = input.nextLine();

            String verificarLogin = "^[a-z0-9]{6,12}$";
            pattern = Pattern.compile(verificarLogin);
            matcher = pattern.matcher(loginUser);

            if (!matcher.matches()) {
                throw new IllegalArgumentException("Nome invalido");
            }

            System.out.println("Digite o seu email: ");
            String email = input.nextLine();

            String verificarEmail = "^\\w+@(hotmail|outlook|gmail)\\.com(\\.br)?$";
            pattern = Pattern.compile(verificarEmail);
            matcher = pattern.matcher(email);

            if (!matcher.matches()) {
                throw new IllegalArgumentException("Email invalido");
            }

            System.out.println("\nCADASTRO REALIZADO COM SUCESSO!");
            System.out.println("nome: " + loginUser);
            System.out.println("email: " + email);
            System.out.println("horário de cadastro: " + horario);
            System.out.println("cep: " + cep);
            System.out.println("telefone: " + celular);

        }
    }
}