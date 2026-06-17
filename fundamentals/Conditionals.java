package fundamentals;

public class Conditionals {
    public static void main(String[] args) {
        
        // The if-else statement
        int age  = 10;

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("Minor");
        }


        int score = 85;

        if (score >= 90) {
            System.out.println("Grade A");
        } else if (score >= 80) {
            System.out.println("Grade B");
        } else if (score >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }


        age = 25;
        boolean hasTicket = true;

        if (age >= 18 && hasTicket) {
            System.out.println("Entry allowed");
        } else {
            System.out.println("Entry denied");
        }


        // The switch statement
        int day = 3;

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");            
        }


        // The newer switch version
        int month = 3;

        switch(month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            default -> System.out.println("Other month");
        }










    }
}
