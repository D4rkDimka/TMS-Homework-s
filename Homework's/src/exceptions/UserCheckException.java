package exceptions;

public class UserCheckException extends RuntimeException {

    public UserCheckException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
