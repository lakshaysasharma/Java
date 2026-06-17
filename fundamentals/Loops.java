package fundamentals;

public class Loops {
    public static void main(String[] args) {

        // while loop
        int i = 1;
        while (i <= 5) {
            // System.out.println(i);
            i++;
        }


        // for loop
        for(int j = 1; j <= 5; j++) {
            // System.out.println(j);
        }


        // do-while loop
        int k = 10;
        do {
            // System.out.println(k);
            k--;
        } while(k > 0);

        int l = 5;
        do {
            // System.out.println(l);
            l++;
        } while(l > 10);



        // break and continue
        for(int m = 1; m <= 10; m++) {
            if (m == 5) {
                break;
            }
            // System.out.println(m);
        }

        for(int n = 1; n <= 7; n++) {
            if (n == 4) {
                continue;
            }
            // System.out.println(n);
        }



        // Nested loops
        for(int p = 1; p <= 4; p++) {
            for(int q = 1; q <= 3; q++) {
                System.out.print(q + " ");
            }
            System.out.println();
        }
        
    }
}


