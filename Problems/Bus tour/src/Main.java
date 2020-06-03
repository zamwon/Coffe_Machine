import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();

        for (int i = 1; i <= numberOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            if (height < bridgeHeight) {
                if (i == numberOfBridges) {
                    System.out.println("Will not crash");
                }
            } else {
                System.out.println("Will crash on bridge " + i);
                break;
            }
        }
    }
}