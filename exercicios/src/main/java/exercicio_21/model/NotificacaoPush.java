package exercicio_21.model;

public class NotificacaoPush implements Notificador {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando Push Notification: " +  mensagem);
    }

}
