package exceptions;

public class UserMemoryIsFullException extends UserCheckException {
    private String message;

    public UserMemoryIsFullException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return "Memory exception (" + message + ")";
    }
}
