import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int companiesWorldWide = scanner.nextInt();


        int[] incomesNum = new int[companiesWorldWide];
        int[] taxesNum = new int[companiesWorldWide];
        int[] taxPayed = new int[companiesWorldWide];
        int max = 0;
        for (int i = 0; i < companiesWorldWide; i++) {
            incomesNum[i] = scanner.nextInt();
        }
        for (int i = 0; i < companiesWorldWide; i++) {
            taxesNum[i] = scanner.nextInt();

            taxPayed[i] = incomesNum[i] * taxesNum[i];
        }
        for (int j = 0; j < companiesWorldWide; j++) {
            if (taxPayed[j] >= taxPayed[max]) {
                max = j;

            }

        }
        System.out.println(max + 1);
    }
}