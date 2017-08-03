package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day26_NestedLogic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int d1 = scan.nextInt();
        int m1 = scan.nextInt();
        int a1 = scan.nextInt();

        int d2 = scan.nextInt();
        int m2 = scan.nextInt();
        int a2 = scan.nextInt();

        int cust = 0;
        if (a1 < a2) { 
            cust = 0;
        } else {
            if (a1 > a2) {
                cust = 10000;
            } else if (m1 > m2) { 
                cust = 500 * (m1 - m2);
            } else if (d1 > d2) { 
                cust = 15 * (d1 - d2);
            }
        }
        System.out.println(cust);

    }

}
