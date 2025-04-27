import java.util.Scanner;

public class Q14_Half_Diamond {
              public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // rows

     // Upper part of the pattern
     for (int row = 1; row <= N; row++) {
        // Print stars
        for (int stars = 1; stars <= row; stars++) {
            System.out.print("*");
        }
        // Change line
        System.out.println();
    }

    // Lower part of the pattern
    for (int row = N - 1; row >= 1; row--) {  part
        // Print stars
        for (int stars = 1; stars <= row; stars++) {
            System.out.print("*");
        }
        // Change line
        System.out.println();
    }



    }
}
