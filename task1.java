
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число n = ");
        int n = iScanner.nextInt();
        int[] arr = new int[n];
        int value = 1;
        int sum = 0;
        System.out.printf("Последовательность n-го по порядку треугольного числа:");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = value * (value + 1) / 2;

            System.out.printf(" %d  ", arr[i]);
            sum = sum + arr[i];
            value++;
        }
        System.out.println();
        System.out.printf("Сумма чисел от 1 до n (n-ое треугольное число): %d ", sum);

        int result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        System.out.println();
        System.out.printf("n! равен %d ", result);
        iScanner.close();
    }
}