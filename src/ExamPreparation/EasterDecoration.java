package ExamPreparation;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());
        double totalIncome = 0;
        for (int i = 0; i < clients; i++) {

            //за всеки един клиент на нов ред до получаване на командата "Finish" се чете:
            //Покупката която клиента е избрал – текст ("basket", "wreath" или "chocolate bunny")
            double itemPrice = 0;
            double allItemsPrice = 0;
            int itemsCount = 0;
            String item = scanner.nextLine();
            while (!item.equals("Finish")) {
                switch (item) {
                    case "basket":
                        itemPrice = 1.50;
                        break;
                    case "wreath":
                        itemPrice = 3.80;
                        break;
                    case "chocolate bunny":
                        itemPrice = 7;
                        break;
                }
                allItemsPrice += itemPrice;
                itemsCount++;
                item = scanner.nextLine();
            }
            if (itemsCount % 2 == 0){
                allItemsPrice *= 0.80;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", itemsCount, allItemsPrice);
            totalIncome += allItemsPrice;
        }
        double averagePricePerClient = totalIncome / clients;
        System.out.printf("Average bill per client is: %.2f leva.", averagePricePerClient);
    }
}
