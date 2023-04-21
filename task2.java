// Вывести все простые числа от 1 до 1000
public class task2 {

    public static void main(String args[]) {

        boolean num;

        for (int i = 2; i < 1000; i++) {
            num = true;

            for (int j = 2; j <= i / j; j++)
                if ((i % j) == 0)
                    num = false;
            if (num)
                System.out.println(i);
        }
    }
}
