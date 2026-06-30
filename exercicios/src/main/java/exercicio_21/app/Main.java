package exercicio_21.app;

import exercicio_21.model.NotificacaoEmail;
import exercicio_21.model.NotificacaoPush;
import exercicio_21.model.NotificacaoSMS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotificacaoEmail email = new NotificacaoEmail();
        NotificacaoPush push = new NotificacaoPush();
        NotificacaoSMS sms = new NotificacaoSMS();

        List<String> frases = new ArrayList();
        frases.add("Sua senha foi alterada com sucesso");
        frases.add("Um novo dispositivo fez login na sua conta.");
        frases.add("Não espere por oportunidades, crie-as.");
        frases.add("Não se esqueça de salvar as alterações no seu projeto.");

        for (String elemento : frases) {
            email.enviarMensagem(elemento);
            push.enviarMensagem(elemento);
            sms.enviarMensagem(elemento);
            System.out.println(("----").repeat(4));
        }
    }
}
