public class homework1_2 {

public static void main(String[] args) {

    String[][] arr = {
        {"1", "2", "3", "45", "34"}, 
        {"4", "5", "6", "Ц", "34"},
        {"4", "5", "6", "45", "34"},
        {"4", "9", "6", "45", "34"},
        {"4", null, "6", "45", "34"}
    };
    // java.lang.NumberFormatException возникает если в массиве если один из елементов массива будет не цифра или null
    // java.lang.ArrayIndexOutOfBoundsException возникает если количество столбцов в массиве меньше 5

    System.out.println(sum2d(arr));



}

// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

    public static int sum2d(String[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);

                sum += val;

            }

        }
        return sum;

    }
}
