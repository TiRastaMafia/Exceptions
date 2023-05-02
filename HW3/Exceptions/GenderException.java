package Exceptions;

import java.io.IOException;

public class GenderException extends ProjectException {
    public GenderException() {
        super("Введен некорректный пол!");
    }
}
