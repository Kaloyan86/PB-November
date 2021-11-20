package ConditionalStatements.Lab;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String color = "green";

        if (color.equals("red")) {
            System.out.println("tomato");
        } else {
            System.out.println("banana");
            System.out.println("bye");
        }

    }
}
