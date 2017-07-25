package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Given an array of <em>N</em> integers, can you find the sum of its elements?
 *
 * <h3>Input Format</h3>
 * The first line contains an integer, <em>N</em>, denoting the size of the array.
 * <br>The second line contains <em>N</em> space-separated integers representing the array's
 * elements.
 *
 * <h3>Output Format</h3>
 * Print the sum of the array's elements as a single integer.
 *
 * <h3>Sample Input</h3>
 * <pre><code>
 *  6
 *  1 2 3 4 10 11
 * </code></pre>
 *
 * <h3>Sample Input</h3>
 * <pre><code>
 *  31
 * </code></pre>
 *
 * <h3>Explanation</h3>
 * We print teh sum of the array's elements is: <em>1 + 2 + 3 + 4 + 10 + 11 = 31</em>
 *
 * @author code36u4r60
 */
public class SimpleArraySum {

    static int simpleArraySum(int n, int[] ar) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ar[i];
        }
        return sum;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int ar_i = 0; ar_i < n; ar_i++) {
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }

}
