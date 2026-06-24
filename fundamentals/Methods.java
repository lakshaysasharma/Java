package fundamentals;


public class Methods {
    public static void main(String[] args) {
        int result = sum(3, 5);
        System.out.println(result);

        System.out.println(sum(10, 20));

        greet("Lakshay");

        checkAge(-1);

        printLine();

        System.out.println(add(2, 3));
        System.out.println(add(3.4, 4.5));
        System.out.println(add(2, 4, 5));

        System.out.println("Is 35 even? : " + isEven(35));
    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static void greet(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static void checkAge(int age) {
        if (age < 0) {
            System.out.println("Invalid age");
            return;
        } 
        System.out.println("Valid age");
    }

    public static void printLine() {
        System.out.println("----------------------");
    }


    // Method overloading
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }


    // Is even?
    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }



}
