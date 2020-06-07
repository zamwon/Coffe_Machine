import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int arrLenght = scanner.nextInt();
        int[] array = new int[arrLenght];
        for (int i = 0; i < arrLenght; i++) {
            array[i] = scanner.nextInt();
        }
        int[] copy = new int[arrLenght];

        for (int i = 0; i < arrLenght; i++) {
            if (i == 0) {
                copy[i] = array[arrLenght - 1];
            } else {
                copy[i] = array[i - 1];
            }
            System.out.print(copy[i] + " ");
        }
    }
}