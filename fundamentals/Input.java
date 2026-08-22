package fundamentals;

import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your age: ");
        // int age = sc.nextInt();
        float age = sc.nextFloat();
        sc.nextLine();
        System.out.println("age: " + age);


        System.out.print("Input your name: ");
        // String name = sc.next();
        String name = sc.nextLine();
        System.out.println("Your name: " + name + " Sharma");

        sc.close();
    }
}
