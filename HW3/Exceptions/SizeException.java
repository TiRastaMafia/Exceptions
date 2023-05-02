package Exceptions;

public class SizeException extends ProjectException {
    public SizeException() {
        super("Введено неверное количество данных!");
    }
}
