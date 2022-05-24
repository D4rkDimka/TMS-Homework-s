package exceptions;

public class UserMemoryIsEmptyCheckException extends UserCheckException {
    private String message;

    public UserMemoryIsEmptyCheckException(String massage) {
        super(massage);
        this.message = massage;
    }

    @Override
    public String getMessage() {
        return "Memory exception (" + message + ")";
    }
}
