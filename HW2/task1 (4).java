import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class task1{
    public static void main(String[] args) {
        floatEntry();
    }


    public static void floatEntry(){
        Scanner scan = new Scanner(System.in);

        try{
            System.out.print("Введите дробное число: ");
            float value = scan.nextFloat();
            System.out.println(value);
        } catch (Exception e){
            System.out.println("Введите корректное значение!");
            floatEntry();
        } finally{
            scan.close();
        }
    }
}