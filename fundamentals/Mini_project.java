package fundamentals;

import java.util.Scanner;

public class Mini_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random() * 100);
        int userNumber = 0;

        do {
            System.out.print("Enter your number(1-100): ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("Congo! You guessed the right number.");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large");
            } else {
                System.out.println("Your number is too small");
            }
        } while(userNumber > 0);

        System.out.println("My number was " + myNumber);

    }
}
