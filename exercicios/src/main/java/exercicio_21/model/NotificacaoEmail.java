package exercicio_21.model;

public class NotificacaoEmail implements Notificador {
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando E-mail: " + mensagem);
    }
}
