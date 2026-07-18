package exercicio_33;

public class ErroAoSalvarLivroException extends RuntimeException {
    public ErroAoSalvarLivroException(String message) {
        super(message);
    }

    public ErroAoSalvarLivroException(String message, Throwable cause) {
        super(message, cause);
    }
}
