package ForLoop.exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        int allPeople = 0;
        int musala = 0;
        int monblan = 0;
        int kilimangaro = 0;
        int k2 = 0;
        int everest = 0;
        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            allPeople += people;
            if (people <= 5) {
                musala += people;
            } else if (people <= 12) {
                monblan += people;
            } else if (people <= 25) {
                kilimangaro += people;
            } else if (people <= 40) {
                k2 += people;
            } else {
                everest += people;
            }
        }
        // 6 / 326 * 100
        System.out.printf("%.2f%%%n",1.0 * musala / allPeople * 100);
        System.out.printf("%.2f%%%n",1.0 * monblan / allPeople * 100);
        System.out.printf("%.2f%%%n",1.0 * kilimangaro / allPeople * 100);
        System.out.printf("%.2f%%%n",1.0 * k2 / allPeople * 100);
        System.out.printf("%.2f%%%n",1.0 * everest / allPeople * 100);
    }
}
