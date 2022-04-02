package exception;

public class UnknownException extends RuntimeException{
    public void UnknownException() {}

    public UnknownException(String message) {
        super(message);
    }
}
