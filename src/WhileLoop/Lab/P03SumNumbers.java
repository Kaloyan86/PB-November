package WhileLoop.Lab;

import java.util.Scanner;

public class P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Прочитаме първоначалното число
        int initialNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        // Започваме да четем числа от конзолата,
        // докато тяхната сума стане по-голяма или равна
        // на първоначалното число
        while (sum < initialNumber) {
            // sum >= number => break;
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        System.out.println(sum);

    }
}
