package machine;

import java.util.Scanner;

public class CoffeeMaker {
    private int water;
    private int milk;
    private int beans;
    private int disposableCups;
    private int money;
    private Scanner scanner;

    public CoffeeMaker(Scanner scanner) {
        this.scanner = scanner;
    }

    public void printContents() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(this.water + " of water");
        System.out.println(this.milk + " of milk");
        System.out.println(this.beans + " of coffee beans");
        System.out.println(this.disposableCups + " of disposable cups");
        System.out.println("$" + this.money + " of money");
    }

    public void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        String input = scanner.next();

        switch (input) {
            case "1":
                if(!hasIngredients(250,16,0,1)) {
                    break;
                }
                this.water -= 250;
                this.beans -= 16;
                this.money += 4;
                this.disposableCups--;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case "2":
                if(!hasIngredients(350,20,75,1)) {
                    break;
                }
                this.water -= 350;
                this.milk -= 75;
                this.beans -= 20;
                this.money += 7;
                this.disposableCups--;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case "3":
                if(!hasIngredients(200,12,100,1)) {
                    break;
                }
                this.water -= 200;
                this.milk -= 100;
                this.beans -= 12;
                this.money += 6;
                this.disposableCups--;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case "back":
                break;
            default:
                System.out.println("Incorrect input");

        }
    }
    private boolean hasIngredients (int w, int b, int m, int c) {
        if (this.water < w) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        if (this.beans < b) {
            System.out.println("Sorry, not enough beans!");
            return false;
        }
        if (this.milk < m) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        if (this.disposableCups < c) {
            System.out.println("Sorry, not enough cups!");
            return false;
        }
        return true;
    }

    public void fill() {
        System.out.println();
        System.out.println("Write how many ml of water do you want to add: ");
        this.water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        this.milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        this.beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        this.disposableCups += scanner.nextInt();
    }

    public void take() {
        System.out.println("I gave you $" + this.money);
        this.money = 0;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
