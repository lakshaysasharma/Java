package fundamentals;

import java.util.Arrays;

public class Arrays_2 {
    
    public static void main(String[] args) {
        
        int[] marks = new int[3];
        marks[0] = 96;
        marks[1] = 95;
        marks[2] = 97;

        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);


        int[] scores = {24, 67, 88};
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        int[][] two_scores = {{44, 56, 78}, {89, 96, 90}};
        System.out.println(two_scores[0][1]);
        System.out.println(two_scores[1][1]);
        System.out.println(two_scores[1][2]);
        // System.out.println(two_scores[1][3]);  // exception

        
    }
}
