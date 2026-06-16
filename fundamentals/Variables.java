package fundamentals;

public class Variables {
    public static void main(String[] args) {
        int age = 25;

        System.out.println(age);

        int count = 100;  // whole numbers
        double price = 99.99;  // decimal numbers
        boolean isOpen = true;  // true or false
        char grade = 'A';  // single character(in single quotes)

        System.out.println(count);
        System.out.println(price);
        System.out.println(isOpen);
        System.out.println(grade);


        long bigNum = 9876543213214L;  // long whole numbers
        short small = 32000;  // small whole numbers
        byte tiny = 127;  // very small whole numbers
        float temp = 99.9f;  // small decimal numbers; double is preferred

        System.out.println(bigNum);
        System.out.println(small);
        System.out.println(tiny);
        System.out.println(temp);


        String name = "Lakshay";
        System.out.println("Name: " + name);


        var naam = "Lakshay Sharma";
        var umar = 22;
        umar = 23;
        System.out.println(naam);
        System.out.println(umar);


        final double PI = 3.14;
        // PI = 3.22;  // gives error
        System.out.println(PI);

        boolean lovesCoffee = true;

        System.out.println(name + " is " + age + " and loves coffee: " + lovesCoffee);
    }
}

