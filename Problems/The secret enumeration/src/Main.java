public class Main {

    public static void main(String[] args) {

        int counter = 0;
        Secret[] nazwy = Secret.values();
        for (Secret nazwa : nazwy) {
            String name = nazwa.toString();
            if (name.matches("STAR*\\w+")) {
                counter++;
            }
        }
        System.out.println(counter);
    }

}
/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/