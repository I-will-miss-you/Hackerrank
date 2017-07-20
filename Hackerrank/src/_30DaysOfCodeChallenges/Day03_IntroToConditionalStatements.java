package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 * <p>
 * In this challenge, we test your knowledge of using <em>if-else</em> conditional statements to
 * automate decision-making processes. An if-else statement has the following logical flow:</p>
 * <pre><code>
 *  IF(A = TRUE)
 *      Then B
 *  ELSE
 *      Then C
 *  END IF
 * </code></pre>
 *
 * <p>
 * <strong>Task</strong>
 * <br>Given an integer, <em>n</em> , perform the following conditional actions:
 * <ul>
 * <li> If <em>n</em> is odd, print <em>Weird</em>
 * <li> If <em>n</em> is even and in the inclusive range of <em>2</em> to <em>5</em> , print <em>Not
 * Weird</em>
 * <li> If <em>n</em> is even and in the inclusive range of <em>6</em> to <em>20</em> , print
 * <em>Weird</em>
 * <li> If <em>n</em> is even and greater than <em>20</em> , print <em>Not Weird</em>
 * </ul>
 * Complete the stub code provided in your editor to print whether or not <em>n</em> is weird.
 *
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>A single line containing a positive integer, <em>n</em></p>
 *
 * <p>
 * <strong>Constraints</strong>
 * <ul><li> 1 &le; n &le; 100 </li></ul>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>Print Weird if the number is weird; otherwise, print Not Weird.</p>
 *
 * <p>
 * <strong>Sample Input 0</strong>
 * <br><code>3</code></p>
 *
 * <p>
 * <strong>Sample Output 0</strong>
 * <br><code>Weird</code></p>
 *
 * <p>
 * <strong>Sample Input 1</strong>
 * <br><code>24</code></p>
 *
 * <p>
 * <strong>Sample Output 1</strong>
 * <br><code>Not Weird</code></p>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br> Sample Case 0: n = 3
 * <br> <em>n</em> is odd and odd numbers are weird, so we print Weird.
 * <br>
 * <br> Sample Case 1: n = 24
 * <br> <em>n</em> 20 and <em>n</em> is even, so it isn't weird. Thus, we print Not Weird.</p>
 *
 * @author code36u4r60
 */
public class Day03_IntroToConditionalStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans;
        if (n % 2 != 0 || n > 5 && n <= 20) {
            ans = "Weird";
        } else {
            ans = "Not Weird";
        }
        System.out.println(ans);
    }

}
