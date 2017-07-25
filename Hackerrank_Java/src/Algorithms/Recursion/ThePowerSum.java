package Algorithms.Recursion;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class ThePowerSum {

    public static int findPowerSum(int x, int n, int num) {
        int value = (int) (x - pow(num, n));

        if (value < 0) {
            return 0;
        }
        if (value == 0) {
            return 1;
        }
        return findPowerSum(value, n, num + 1) + findPowerSum(x, n, num + 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(findPowerSum(x, n, 1));
    }

}
