package Exceptions;


public class DateException extends ProjectException{

    public DateException() {
        super("Введен неверный формат даты!");
    }
}
