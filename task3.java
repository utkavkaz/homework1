
// Реализовать простой калькулятор
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.println();
        System.out.print("Введите операцию: ");
        char b = iScanner.next().charAt(0);
        System.out.println();
        System.out.print("Введите второе число: ");
        int c = iScanner.nextInt();
        int d = 0;
        if (b == '+') {
            d = a + c;
        } else if (b == '-') {
            d = a - c;
        } else if (b == '*') {
            d = a * c;
        } else if (b == '/') {
            d = a / c;
        }
        System.out.println();
        System.out.printf("Ответ: %d ", d);
        iScanner.close();
    }
}