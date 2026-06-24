package fundamentals;

public class Methods {
    public static void main(String[] args) {
        int result = sum(3, 5);
        System.out.println(result);

        System.out.println(sum(10, 20));

        greet("Lakshay");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void greet(String name) {
        System.out.println("Hello " + name + "!");
    }



}
