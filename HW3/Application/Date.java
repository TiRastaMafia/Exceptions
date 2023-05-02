package Application;

import Exceptions.DateException;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Date {
    private LocalDate date;

    public Date(String userDate){
        // используя регулярку сплитим строку , парсим в инт и записываем в поле date
        String[] elementsDate = userDate.split("[,./-]");
        try{
            this.date = LocalDate.of(Integer.parseInt(elementsDate[2]), Integer.parseInt(elementsDate[1]),
                    Integer.parseInt(elementsDate[0]));
        }catch (DateTimeException dEx){
            throw new DateException();
        }

    }

    @Override
    public String toString() {
        return "" + date;
    }

    public LocalDate getDate() {
        return date;
    }

    

}
