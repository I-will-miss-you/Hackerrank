package _10DaysOfStatistics;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author code36u4r60
 */
public class Day1_Quartiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = scan.nextInt();
        }

        Arrays.sort(x);

        int[] l = Arrays.copyOfRange(x, 0, x.length >> 1);
        int[] r = Arrays.copyOfRange(x,
                (x.length % 2 == 0)
                        ? x.length >> 1
                        : (x.length >> 1) + 1,
                x.length);

        int Q2 = calcQ(x);
        int Q1 = calcQ(l);
        int Q3 = calcQ(r);

        System.out.println(Q1);
        System.out.println(Q2);
        System.out.println(Q3);

    }

    static int calcQ(int[] num) {
        int n = (int) Arrays.stream(num).count();
        int c = n >> 1;
        return (n % 2 == 0) ? (num[c - 1] + num[c]) / 2 : num[c];
    }
}
