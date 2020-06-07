class Cat {

    static String name;
    static int age;
    static int counter;

    // write static and instance variables

    public Cat(String name, int age) {
        Cat.name = name;
        Cat.age = age;
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
        // implement the constructor
        // do not forget to check the number of cats
    }

    public static int getNumberOfCats() {

        return counter;
        // implement the static method
    }
}