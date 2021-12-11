package ExamPreparation;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player = scanner.nextLine();
        int startingPoints = 301;
        int successfulShots = 0;
        int unsuccessfulShots = 0;
        String area = scanner.nextLine();
        while (!area.equals("Retire")) {
            int points = Integer.parseInt(scanner.nextLine());
            // "Single", "Double" или "Triple"
            switch (area) {
                case "Double":
                    points *= 2;
                    break;
                case "Triple":
                    points *= 3;
                    break;
            }
            // Проверка за валиден изтрел
            // точки равни на оставащите или по-малки, такъв удар се счита за успешен.
            if (points <= startingPoints) {
                startingPoints -= points;
                successfulShots++;
            } else {
                unsuccessfulShots++;
            }
            if (startingPoints == 0) {
                break;
            }
            area = scanner.nextLine();
        }
        if (startingPoints == 0) {
            System.out.printf("%s won the leg with %d shots.", player, successfulShots);
        } else {
            System.out.printf("%s retired after %d unsuccessful shots.", player, unsuccessfulShots);
        }
    }
}
