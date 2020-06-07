package machine;

import java.util.Scanner;

public class CoffeeMachine {
    int water = 400;
    int milk = 540;
    int coffeeBeans = 120;
    int disposableCups = 9;
    int cash = 550;

    private enum Action {
        BUY("buy"),
        FILL("fill"),
        TAKE("take"),
        REMAINING("remaining"),
        EXIT("exit");

        String actionChosen;

        Action(String actionChosen) {
            this.actionChosen = actionChosen;
        }
    }
    //TODO change drinks input to enum
//    enum Drinks {
//        ESPRESSO(250, 0, 16, 4),
//        LATTE(350, 75, 20, 7),
//        CAPPUCCINO(200, 100, 12, 6);
//
//        private final int water;
//        private final int milk;
//        private final int beans;
//        private final int money;
//
//        Drinks(int water, int milk, int beans, int money) {
//            this.water = water;
//            this.milk = milk;
//            this.beans = beans;
//            this.money = money;
//        }}
    private final Scanner scanner = new Scanner(System.in);

    private void chooseAction() {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit): \n");
        String input = scanner.next();
        Action action = Action.valueOf(input.toUpperCase());

        switch (action) {
            case BUY:
                buyACoffee(); // Przywołaj metodę kupowanie kawy
                break;
            case FILL:
                fillMachine(); // Przywołaj metodę uzupełnianie
                break;
            case TAKE:
                checkout(); // Przywołaj metodę pobierania pieniędzy
                break;
            case REMAINING:
                remain(); // Przywołaj metodę stan maszyny
                break;
            case EXIT:
                break;
        }
    }

    private void buyACoffee() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String whatCoffeeKind = scanner.next();

        switch (whatCoffeeKind) {
            case "1":  // espresso
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    chooseAction();//
                } else if (coffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans");
                    chooseAction();
                } else if (disposableCups < 1) {
                    System.out.println("Sorry, not enough cups");
                    chooseAction();
                } else {
                    water -= 250;
                    coffeeBeans -= 16;
                    cash += 4;
                    disposableCups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                    chooseAction();
                }
                break;
            case "2":  // late
                if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                    chooseAction();
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                    chooseAction();
                } else if (coffeeBeans < 20) {
                    System.out.println("Sorry, not enough coffee beans");
                    chooseAction();
                } else if (disposableCups < 1) {
                    System.out.println("Sorry, not enough cups");
                    chooseAction();
                } else {
                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    cash += 7;
                    disposableCups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                    chooseAction();
                }
                break;
            case "3":  // cappuccino
                if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                    chooseAction();
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    chooseAction();
                } else if (coffeeBeans < 12) {
                    System.out.println("Sorry, not enough coffee beans");
                    chooseAction();
                } else if (disposableCups < 1) {
                    System.out.println("Sorry, not enough cups");
                    chooseAction();
                } else {
                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    cash += 6;
                    disposableCups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                    chooseAction();
                }
                break;
            case "back":
                chooseAction();
                break;

        }
    }

    private void fillMachine() {
        System.out.println("Write how many ml of water do you want to add:");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addCoffee = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addCups = scanner.nextInt();
        water += addWater;
        milk += addMilk;
        coffeeBeans += addCoffee;
        disposableCups += addCups;
        chooseAction();
    }

    private void remain() {
        System.out.println("\nThe coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                coffeeBeans + " of coffee beans\n" +
                disposableCups + " of disposable cups\n" +
                "$" + cash + " of money");
        chooseAction();
    }

    private void checkout() {
        System.out.println("I gave you $" + cash);
        cash = 0;
        chooseAction();
    }


    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.chooseAction();


    }
}
