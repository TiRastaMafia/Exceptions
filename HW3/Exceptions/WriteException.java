package Exceptions;

public class WriteException extends ProjectException{
    public WriteException() {
        super("Ошибка при создании файла! Повторите попытку!");
    }
}
