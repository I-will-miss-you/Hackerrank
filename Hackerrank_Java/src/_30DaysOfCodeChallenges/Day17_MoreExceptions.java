package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 * <h3>Objective</h3>
 * Yesterday's challenge taught you to manage exceptional situations by using <em>try</em> and
 * <em>catch</em> blocks. In today's challenge, you're going to practice throwing and propagating an
 * exception. Check out the
 * <a href="https://www.hackerrank.com/challenges/30-more-exceptions/tutorial">Tutorial</a> tab for
 * learning materials and an instructional video!
 *
 * <h3>Task</h3>
 * Write a Calculator class with a single method: <code>int power(int,int)</code>. The power method
 * takes two integers, <em>n</em> and <em>p</em> as parameters and returns the integer result of
 * <em>n<sup>p</sup></em>. If either <em>n</em> or <em>p</em> is negative, then the method must
 * throw an exception with the message: n and p should be non-negative.
 *
 * <p>
 * <strong>Note:</strong> Do not use an access modifier (e.g.: public) in the declaration for your
 * Calculator class.
 *
 * <h3>Input Format</h3>
 * Input from stdin is handled for you by the locked stub code in your editor. The first line
 * contains an integer, <em>T</em>, the number of test cases. Each of the <em>T</em> subsequent
 * lines describes a test case in <em>2</em> space-separated integers denoting <em>n</em> and
 * <em>p</em> , respectively.
 *
 * <h3>Constraints</h3>
 * <ul><li>No Test Case will result in overflow for correctly written code.</li></ul>
 *
 * <h3>Output Format</h3>
 * Output to stdout is handled for you by the locked stub code in your editor. There are <em>T</em>
 * lines of output, where each line contains the result of <em>n<sup>p</sup></em> as calculated by
 * your Calculator class' power method.
 *
 * <h3>Sample Input</h3>
 * <pre><code>
 *  4
 *  3 5
 *  2 4
 *  -1 -2
 *  -1 3
 * </code></pre>
 *
 * <h3>Sample Output</h3>
 * <pre><code>
 *  243
 *  16
 *  n and p should be non-negative
 *  n and p should be non-negative
 * </code></pre>
 *
 * <h3>Explanation</h3>
 * <em>T</em> = 4
 * <br><em>T<sub>0</sub></em>: 3 and 5 are positive, so power returns the result of
 * <em>3<sup>5</sup></em>, which is <em>243</em>.
 * <br><em>T<sub>1</sub></em>: 2 and 4 are positive, so power returns the result of
 * <em>2<sup>4</sup></em>, which is <em>16</em>.
 * <br><em>T<sub>2</sub></em>: Both inputs (-1 and -2) are negative, so <em>power</em> throws an
 * exception and <code>n and p should be non-negative</code> is printed.
 * <br><em>T<sub>2</sub></em>: Both inputs (-1) is negative, so <em>power</em> throws an exception
 * and <code>n and p should be non-negative</code> is printed.
 *
 * @author code36u4r60
 */
public class Day17_MoreExceptions {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

class Calculator {

    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(n, p);
    }
}
