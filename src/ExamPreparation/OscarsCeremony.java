package ExamPreparation;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rentHall = Integer.parseInt(scanner.nextLine());

        //  Статуетки  – цената им е 30% по-малка от наема на залата
        double statuettes = rentHall * 0.70;
        //	Кетъринг – цената му е 15% по-малка от тази на статуетките
        double catering = statuettes * 0.85;
        //  Озвучаване – цената му е 1 / 2 от цената за кетъринг
        double sound = catering * 0.50;
        // Всички разходи
        double totalSum = rentHall + statuettes + catering + sound;

        System.out.printf("%.2f", totalSum);
    }

}
