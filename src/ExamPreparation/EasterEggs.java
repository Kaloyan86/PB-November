package ExamPreparation;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggs = Integer.parseInt(scanner.nextLine());
        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int maxEggs = 0;
        String maxEggColor = "";
        // Правим for-loop по броя на яйцата
        for (int i = 0; i < eggs; i++) {
            // текст с възможности: "red", "orange", "blue", "green"
            String color = scanner.nextLine();
            switch (color) {
                case "red":
                    red++;
                    if (maxEggs < red) {
                        maxEggs = red;
                        maxEggColor = "red";
                    }
                    break;
                case "orange":
                    orange++;
                    if (maxEggs < orange) {
                        maxEggs = orange;
                        maxEggColor = "orange";
                    }
                    break;
                case "blue":
                    blue++;
                    if (maxEggs < blue) {
                        maxEggs = blue;
                        maxEggColor = "blue";
                    }
                    break;
                case "green":
                    green++;
                    if (maxEggs < green) {
                        maxEggs = green;
                        maxEggColor = "green";
                    }
                    break;
            }
        }
        System.out.printf("Red eggs: %d%n", red);
        System.out.printf("Orange eggs: %d%n", orange);
        System.out.printf("Blue eggs: %d%n", blue);
        System.out.printf("Green eggs: %d%n", green);
        System.out.printf("Max eggs: %d -> %s", maxEggs, maxEggColor);
    }
}
