package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 * <strong>Objective</strong>
 * Today, we're getting started with Exceptions by learning how to parse an integer from a string
 * and print a custom error message. Check out the
 * <a href="https://www.hackerrank.com/challenges/30-exceptions-string-to-integer/editorial">
 * Tutorial</a> tab for learning materials and an instructional video!
 *
 * <h3>Task</h3>
 * Read a string, <em>S</em>, and print its integer value; if <em>S</em> cannot be convert to an
 * integer, print <em>Bad String</em>.
 *
 * <strong>Note:</strong> You must use the String-to-Integer and exception handling constructs built
 * into your submission language. If you attempt to use loops/conditional statements, you will get a
 * <em>0</em> score
 *
 * <h3>Input Format</h3>
 * A single string, <em>S</em>.
 *
 * <h3>Constraints</h3>
 * <ul>
 * <li> 1 &le; |<em>S</em>| &le; 6, where |<em>S</em>| is the length of string <em>S</em>.
 * <li> <em>S</em> is composed of <em>either</em> lowercase letters (a - z) <em>or</em> decimal
 * digits(0 - 9).
 * </ul>
 *
 * <h3>Output Format</h3>
 * Print the parsed integer value of <em>S</em>, or <em>Bad String</em> if <em>S</em> cannot be
 * converted to an integer.
 *
 * <h3>Sample Input 0</h3>
 * <pre><code>
 *  3
 * </code></pre>
 *
 * <h3>Sample Output 0</h3>
 * <pre><code>
 *  3
 * </code></pre>
 *
 * <h3>Sample Input 1</h3>
 * <pre><code>
 *  3
 * </code></pre>
 *
 * <h3>Sample Output 1</h3>
 * <pre><code>
 *  Bad String
 * </code></pre>
 *
 * <h3>Explanation</h3>
 * <em>Sample Case 0</em> contains an integer, so it should not raise an exception when we attempt
 * to convert it to an integer.
 * <br>Thus, we print the <em>3</em>.
 * <br><em>Sample Case 1</em> does not contain any integers, so an attempt to convert it to an
 * integer will raise an exception. Thus, our exception handler prints <em>Bad String</em>.
 *
 * @author code36u4r60
 */
public class Day16_Exceptions_StringToInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            int n = Integer.parseInt(S);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }

}
