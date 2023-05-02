// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, 
// которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class homework1_4 {

    public static void main(String[] args) {

        int[] r1 = { 6, 4, 1, 3, 7 };
        int[] r2 = { 3, 0, 1, 3 };

        divOfArrays(r1, r2);
    }

    public static void printArray(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

    }

    public static void divOfArrays(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            printArray(_divOfArrays(array1, array2));
        } else
            System.out.println("ОШИБКА: массивы разной длины");
    }

    private static int[] _divOfArrays(int[] array1, int[] array2) {

        int[] newArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("Делить на 0 нельзя!");
            } else {
                newArray[i] = array1[i] / array2[i];
            }
        }
        return newArray;

    }
}