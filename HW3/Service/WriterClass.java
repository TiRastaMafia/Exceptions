package Service;

import Application.DataClass;
import Exceptions.WriteException;

import java.io.*;

public class WriterClass {
    private  DataClass dClass;
    private String pathFolder;
    // метод принимающий объект класса DataClass и создающий файл по полю фамилия
    // и записывающий все поля в нудном порядке в csv файл

    public WriterClass(String pathFolder) {
        this.pathFolder = pathFolder;
    }

    public void setDClass(DataClass dClass) {
        this.dClass = dClass;
    }

    public void fileWriter() {

        try (FileWriter fWriter = new FileWriter(  pathFolder + "\\" + dClass.getSurname().toLowerCase() + ".csv", true)){
            fWriter.write(dClass.getSurname() + ";" + dClass.getName() + ";" + dClass.getPatronymic() + ";"
                    + dClass.getDate() + ";" + dClass.getPhone() + ";" + dClass.getGender() + "\n");

        } catch (IOException e) {
            throw new WriteException();
        }


    }

}

//    i i i 12.12.1212 7894564 m