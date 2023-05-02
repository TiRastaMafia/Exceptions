import java.util.Scanner;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class task4 {
    public static void main(String[] args) {
        lineEntry();
    }

    public static void lineEntry(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите значение: ");
        String value = scan.nextLine();
        if (value != ""){
            System.out.println(value);
            scan.close();
        } else {
            scan.close();
            throw new RuntimeException("Поле не может быть пустым!");
        }  

    }
}