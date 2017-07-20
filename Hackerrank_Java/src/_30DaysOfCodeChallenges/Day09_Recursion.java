package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 * <p>
 * <strong>Objective</strong>
 * <br>Today, we're learning and practicing an algorithmic concept called Recursion. Check out the
 * Tutorial tab for learning materials and an instructional video!</p>
 *
 * <p>
 * <strong>Recursive Method for Calculating Factorial </strong>
 * <pre>
 *                     | 1                          N&le;1
 *      <i>factorial(N)</i> = |
 *                     | N x <i>factorial(N - 1)</i>    Otherwise
 * </pre>
 *
 * <p>
 * <strong>Task</strong>
 * <br>Write a factorial function that takes a positive integer, <em>N</em> as a parameter and
 * prints the result of <em>N!</em> (<em>N</em> factorial).</p>
 *
 * <p>
 * <strong>Note:</strong> If you fail to use recursion or fail to name your recursive function
 * factorial or Factorial, you will get a score of <em>0</em>.
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>A single integer, <em>N</em> (the argument to pass to factorial).</p>
 *
 * <p>
 * <strong>Constraints</strong>
 * <ul>
 * <li> 2 &le; N &le; 12
 * <li> Your submission must contain a recursive function named factorial.
 * </ul>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <pre>    <code>3</code></pre>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <pre>    <code>6</code></pre>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br>Consider the following steps:
 * <ol>
 * <li><i>factorial(3)</i> = 3 x <i>factorial(2)</i>
 * <li><i>factorial(2)</i> = 2 x <i>factorial(1)</i>
 * <li><i>factorial(1)</i> = 1
 * </ol>
 * From steps 2 and 3, we can say <i>factorial(2)</i> = 2 x 1 = 2; then when we apply the value from
 * <i>factorial(2)</i> to step 1, we get <i>factorial(3)</i> = 3 x 2 x 1 = 6. Thus, we print 6 as
 * our answer.
 *
 * @author code36u4r60
 */
public class Day09_Recursion {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }

}
