package NestedLoops.Lab;

public class Clock {
    public static void main(String[] args) {
        // for-loop - hours
        for (int h = 0; h <= 23; h++) {
            // for-loop - minutes
            for (int m = 0; m <= 59; m++) {
                System.out.printf("%d:%d%n", h, m);
            }
        }

    }
}
