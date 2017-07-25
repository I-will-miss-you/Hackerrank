package Algorithms.Recursion;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class ThePowerSum {

    public static int findPowerSum(int total, int power, int num) {
        int value = (int) (total - pow(num, power));

        if (value < 0) {
            return 0;
        } else if (value == 0) {
            return 1;
        } else {
            return findPowerSum(value, power, num + 1)
                    + findPowerSum(total, power, num + 1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = s.nextInt();
        int power = s.nextInt();
        System.out.println(findPowerSum(total, power, 1));
    }

}
