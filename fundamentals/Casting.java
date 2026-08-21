package fundamentals;

public class Casting {

    public static void main(String[] args) {
        
        // Implicit casting
        double value = 100.00;
        double finalValue = value + 18;

        System.out.println(finalValue);

        // explicit casting
        int v = 100;
        int finalV = v + (int)18.00;

        System.out.println(finalV);


        // final keyword
        float pi = 3.14f;
        pi = 1.14f;
        System.out.println(pi);

        final float val = 3.14f;
        // val = 8.3f;  // error
        System.out.println(val);
    }   
}
