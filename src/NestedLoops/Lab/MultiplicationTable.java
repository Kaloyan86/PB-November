package NestedLoops.Lab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // x * y = ?
        // x -> 1 - 10
        // y -> 1 - 10
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.printf("%d * %d = %d%n", x, y, x * y);
            }
        }
    }
}
