import java.util.Random;

public class Main {

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        //Задание 1
        System.out.println("Решение задачи 1:");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println();

        //Задание 2 - используем ранее созданный массив
        System.out.println("Решение задачи 2:");
        int arrMax = arr[0];
        int arrMin = arr[0];

        for (int i : arr) {
            if (i > arrMax) arrMax = i;
            if (i < arrMin) arrMin = i;
        }
        System.out.println("Минимальная сумма трат за день составила " + arrMin + " рублей. Максимальная сумма трат за день составила " + arrMax + " рублей");

        System.out.println();

        //Задание 3 - используем ранее созданный массив
        System.out.println("Решение задачи 3:");
        //Ранее была рассчитано значение переменной sum - сумма трат за месяц
        //поэтому полученное значение просто поделим на количество дней
        //а среднее значение присвоим новой переменной
        double average = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println();

        //Задание 4
        System.out.println("Решение задачи 4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
