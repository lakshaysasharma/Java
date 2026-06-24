package fundamentals;

public class Arrays {

    public static void main(String[] args) {
        
        int[] scores = {91, 75, 65, 85, 63};

        System.out.println(scores);  // gives a giberish code
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        scores[1] = 100;
        System.out.println(scores[1]);

        System.out.println(scores.length);  // 5

        String str = "Lakshay";
        System.out.println(str.length());  // 7

        int[] marks = {50, 55, 65, 85, 90};
        for(int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }


        // Summing an array
        int[] nums = {12, 24, 35, 46, 57};
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        System.out.println("Total: " + total);


        // The enhanced for loop (for-each)
        int[] numbers = {85, 55, 65, 45, 22};
        for(int number : numbers) {
            System.out.println(number);
        }

        String[] names = {"Lakshay", "Varun", "Keshav"};
        System.out.println(names[1]);


        // int[] marks = new int[5];
        marks[0] = 45;
        marks[1] = 55;
        marks[2] = 65;
        marks[3] = 75;
        marks[4] = 85;
        for(int mark : marks) {
            System.out.println(mark);
        }


    }
}
