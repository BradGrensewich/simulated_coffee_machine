package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMaker cm = new CoffeeMaker(scanner);
        cm.setWater(400);
        cm.setMilk(540);
        cm.setBeans(120);
        cm.setDisposableCups(9);
        cm.setMoney(550);


        while (true) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String input = scanner.next();

            if (input.equals("exit"))  {
                break;
            }
            switch (input) {
                case "buy":
                    cm.buy();
                    break;
                case "fill":
                    cm.fill();
                    break;
                case "take":
                    cm.take();
                    break;
                case "remaining":
                    cm.printContents();
                    break;
                default:
                    System.out.println("Incorrect input: " + input);
            }
        }

    }
}
