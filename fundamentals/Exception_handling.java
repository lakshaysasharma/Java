package fundamentals;

public class Exception_handling {
    
    public static void main(String[] args) {
        // Try-catch

        int[] marks = {98, 95, 78};

        try{
            System.out.println(marks[5]);
        } catch(Exception e) {
            System.out.println(e);
        }

        System.out.println("My name is Lakshay");

        
    }
}
