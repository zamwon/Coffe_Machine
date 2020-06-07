import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int inputNum, modulo, sum = 0;
        inputNum = scanner.nextInt();
        while (inputNum > 0){
            modulo = inputNum % 10;
            sum += modulo;
            inputNum /= 10;
        }
        System.out.println(sum);
    }
}