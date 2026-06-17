package fundamentals;

public class Operators {
    public static void main(String[] args) {
        

        // Arithmetic Operators
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println(10 / 3);
        System.out.println(10.00 / 3);


        // Assignment Operators
        int x = 10;

        x += 5;  // 15
        x -= 3;  // 12
        x *= 2;  // 24
        x /= 2;  // 12
        x %= 5;  // 2
        System.out.println("Value of x: " + x);


        // Increment and Decrement
        int count = 5;

        count++;  
        System.out.println(count);  // 6
        count--;
        System.out.println(count);  // 5
        System.out.println(count++);  // 5 (post-increment)


        // Comparison Operators
        a = 10;
        b = 3;

        System.out.println(a == b);  // false
        System.out.println(a != b);  // true
        System.out.println(a > b);  // true
        System.out.println(a < b);  // false
        System.out.println(a >= b);  // true
        System.out.println(a <= b);  // false


        // Logical Operators
        boolean m = true;
        boolean n = false;

        System.out.println(m && n);  // false
        System.out.println(m || n);  // true
        System.out.println(!m);  // false

        int age = 25;
        boolean hasLicense = true;
        boolean canDrive = age > 18 && hasLicense == true;
        System.out.println("Can drive? : " + canDrive);  // true

    }
}





