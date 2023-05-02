import java.util.Scanner;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

// 1 иск выход за пределы массива
// 2 иск деление на 0
// 3 иск ошибка ввода
/**
 * homework1
 */
public class homework1_1 {
    public static void main(String[] args) {
        int[] a = { 0, 15, 89, 5, 2 };
        // java.util.InputMismatchException возникнет в случае если ввести не цифру
        changeElementOfArray(a, 2);

        // java.lang.ArrayIndexOutOfBoundsException Индекс 5 выходит за пределы длины 5
        showElementOfArray(a);

        // java.lang.ArithmeticException возникает при делителе равном 0
        divisionByZero();

    }

    public static void changeElementOfArray(int[] array, int index) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Введите значение: ");
        array[index] = scr.nextInt();
        scr.close();
    }

    public static void divisionByZero() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Введите делимое: ");
        int a = scr.nextInt();
        System.out.print("Введите делитель: ");
        int b = scr.nextInt();
        System.out.println(a / b);
        scr.close();
    }

    public static void showElementOfArray(int[] array) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Введите индекс элемента: ");
        int position = scr.nextInt();
        System.out.println(array[position]);
        scr.close();
    }
}