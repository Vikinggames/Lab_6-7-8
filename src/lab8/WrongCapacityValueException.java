package lab8;

public class WrongCapacityValueException extends RuntimeException{
    public WrongCapacityValueException() {
    }

    public WrongCapacityValueException(String message) {
        super(message);
    }
}