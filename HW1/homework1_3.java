// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.

public class homework1_3 {

    public static void main(String[] args) {

        int[] r1 = { 3, 4, 1, 3 };
        int[] r2 = { 3, 4, 1, 3, 3 };

        diffOfArrays(r1, r2);
    }

    public static void printArray(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

    }

    public static void diffOfArrays(int[] array1, int[] array2) {
        if (array1.length == array2.length){
           printArray(_diffOfArrays(array1, array2));
        } else System.out.println("ОШИБКА: массивы разной длины");
    }

    private static int[] _diffOfArrays(int[] array1, int[] array2) {

        int[] newArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i] - array2[i];
        }
        return newArray;

    }
}
