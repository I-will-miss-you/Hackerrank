
package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day29_BitwiseAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            if ((k - 1 | k) <= n) {
                System.out.println(k - 1);
            } else {
                System.out.println(k - 2);
            }
        }
    }

}
