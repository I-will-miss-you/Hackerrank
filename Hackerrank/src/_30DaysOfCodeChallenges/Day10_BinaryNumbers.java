package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 * <p>
 * <strong>Objective</strong>
 * <br>Today, we're working with binary numbers. Check out the
 * <a href="https://www.hackerrank.com/challenges/30-binary-numbers/tutorial">Tutorial</a> tab for
 * learning materials and an instructional video!</p>
 *
 * <p>
 * <strong>Task</strong>
 * Given a base-<em>10</em> integer, <em>n</em>, convert it to binary (base-<em>2</em>). Then find
 * and print the base-<em>10</em> integer denoting the maximum number of consecutive <em>1</em>'s in
 * <em>n</em>'s binary representation.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br> A single integer, <em>n</em>.</p>
 *
 * <p>
 * <strong>Constraints</strong>
 * <ul><li>1 &le; <em>n</em> &le; 10<sup>6</sup></li></ul>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>Print a single base-<em>10</em> integer denoting the maximum number of consecutive
 * <em>1</em>'s in the binary representation of <em>n</em>.</p>
 *
 * <p>
 * <strong>Sample Input 1</strong>
 * <pre><code>  5</code></pre>
 *
 * <p>
 * <strong>Sample Output 1</strong>
 * <pre><code>  5</code></pre>
 *
 * <p>
 * <strong>Sample Input 2</strong>
 * <pre><code>  13</code></pre>
 *
 * <p>
 * <strong>Sample Output 2</strong>
 * <pre><code>  2</code></pre>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br>Sample Case 1: The binary representation of <em>5</em> is <em>101</em>, so the maximum number
 * of consecutive <em>1</em>'s is <em>1</em>.
 * <br>
 * <br>Sample Case 2: The binary representation of <em>13</em> is <em>1101</em>, so the maximum
 * number of consecutive <em>1</em>'s is <em>2</em>.
 *
 * @author code36u4r60
 */
public class Day10_BinaryNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0, max = 0;
        while (n > 0) {
            counter = (n % 2 == 1) ? ++counter : 0;
            max = Math.max(counter, max);
            n /= 2;
        }
        System.out.println(max);
    }

}
