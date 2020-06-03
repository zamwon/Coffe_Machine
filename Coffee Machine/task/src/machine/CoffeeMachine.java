package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

       
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");

        int ileKawusi = scanner.nextInt();

        int ileKawWoda = water / 200;
        int ileKawMleko = milk / 50;
        int ileKawKawa = coffeBeans / 15;
        int kawy = Math.min(ileKawKawa, Math.min(ileKawWoda, ileKawMleko));
        if (kawy == ileKawusi) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if ((water >= (kawy * 200)) && (milk >= (kawy * 50))
                && (coffeBeans >= kawy * 15)) {
            System.out.println("Yes, I can make that amount of coffee" +
                    " (and even " + (kawy - ileKawusi) + " more than that)");
        }
        if (ileKawusi > kawy) {
            System.out.println("No, I can make only " + kawy + " cup(s) of coffee");
        } else if ((water < (kawy * 200))
                || (milk < (kawy * 50)) || (coffeBeans < kawy * 15)) {
            System.out.println("No, I can make only "
                    + (kawy - ileKawusi) + " cup(s) of coffee");

        }
    }
}
