package exercicio_21.model;

public class NotificacaoSMS implements Notificador {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
