package Application;


import Exceptions.DateException;
import Exceptions.GenderException;
import Exceptions.PhoneException;
import Exceptions.SizeException;
import java.util.ArrayList;
import java.util.List;

public class DataClass {
    private String name;
    private String surname;
    private String patronymic;
    private Date date;
    private Phone phone;
    private Gender gender;

    // метод принимающий строку и заполняющий поля

    public void parser(String userText) {
        List<String> buffer = new ArrayList<>();
        buffer = List.of(userText.split("[,; ]"));
        if (buffer.size() == 6) {
            for (int i = 0; i < buffer.size(); i++) {
                if (buffer.get(i).matches(".*[0-9].*")) {
                    if (buffer.get(i).matches(".*[.,/-].*")) {
                        date = new Date(buffer.get(i));
                    } else {
                        phone = new Phone(buffer.get(i));
                    }
                } else if (buffer.get(i).length() == 1) {
                    try {
                        gender = new Gender(buffer.get(i));
                    } catch (GenderException ex) {
                        throw new GenderException();
                    }

                }
            }
            if (date == null) {
                throw new DateException();
            }
            if (phone == null) {
                throw new PhoneException();
            }
            if (gender.getGender() == null) {
                throw new GenderException();
            }
            surname = buffer.get(0);
            name = buffer.get(1);
            patronymic = buffer.get(2);

        } else if (buffer == null){
            throw new SizeException();
        } else {
            throw new SizeException();
        }
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Date getDate() {
        return date;
    }

    public Phone getPhone() {
        return phone;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "DataClass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", date=" + date +
                ", phone=" + phone +
                ", gender=" + gender +
                '}';
    }
}