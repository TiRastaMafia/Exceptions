import Application.DataClass;
import Exceptions.ProjectException;
import Service.WriterClass;

import java.util.Scanner;

public class Controller {

    private static String path = "UsersData";
    public static void start(){
        try{
            _start();
        } catch (ProjectException ex){
            System.out.println(ex.getMessage());
            _start();
        }
    }

    private static void _start(){
        WriterClass writer = new WriterClass(path);
        Scanner scan = new Scanner(System.in);
        boolean status = true;
        while (status){
            System.out.print("Меню:\n" + "1. Добавить запись\n" + "2. Выход\n");
            switch (scan.nextLine()){
                case "1":
                    System.out.println("Введите ФИО Дату рождения Номер телефона и пол:");
                    String c = scan.nextLine();
                    DataClass user = new DataClass();
                    user.parser(c);
                    writer.setDClass(user);
                    writer.fileWriter();
                    System.out.println(user);
                    break;
                case "2":
                    status = false;
                    scan.close();
                    break;
                default:
                    System.out.println("Введена неверная команда! Повторите попытку!");
            }

        }
    }
}
