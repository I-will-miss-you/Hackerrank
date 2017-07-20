package _30DaysOfCodeChallenges;

import java.util.Scanner;

/**
 * <p>
 * <strong>Objective</strong>
 * <br>Today, we're discussing data types. Check out the
 * <a href="https://www.hackerrank.com/challenges/30-data-types/tutorial">Tutorial</a> tab for
 * learning materials and an instructional video!</p>
 *
 * <p>
 * <strong>Task</strong>
 * <br>Complete the code in the editor below. The variables <i>i</i>, <i>d</i>, and <i>s</i> are
 * already declared and initialized for you. You must:
 * <ol>
 * <li>Declare <i>3</i> variables: one of type <code>int</code>, one of type <code>double</code>,
 * and one of type <code>String</code>.
 * <li>Read <i>3</i> lines of input from stdin (according to the sequence given in the Input Format
 * section below) and initialize your <i>3</i> variables.
 * <li>Use the + operator to perform the following operations:
 * <ol>
 * <li>Print the sum of <i>i</i> plus your int variable on a new line.
 * <li>Print the sum of <i>d</i> plus your double variable to a scale of one decimal place on a new
 * line.
 * <li>Concatenate <i>s</i> with the string you read as input and print the result on a new line.
 * </ol>
 * </ol>
 *
 *
 * <p>
 * <strong>Note:</strong> If you are using a language that doesn't support using + for string
 * concatenation (e.g.: C), you can just print one variable immediately following the other on the
 * same line. The string provided in your editor <i>must</i> be printed first, immediately followed
 * by the string you read as input.</p>
 *
 * <p>
 * <strong>Input Format</strong>
 * <br>The first line contains an integer that you must sum with <i>i</i> .
 * <br>The second line contains a double that you must sum with <i>d</i> .
 * <br>The third line contains a string that you must concatenate with <i>s</i> .
 * </p>
 *
 * <p>
 * <strong>Output Format</strong>
 * <br>Print the sum of both integers on the first line, the sum of both doubles (scaled to 1
 * decimal place) on the second line, and then the two concatenated strings on the third line.</p>
 *
 * <p>
 * <strong>Sample Input</strong>
 * <pre><code>
 * 12
 * 4.0
 * is the best place to learn and practice coding!
 * </code></pre>
 *
 * <p>
 * <strong>Sample Output</strong>
 * <pre><code>
 * 16
 * 8.0
 * HackerRank is the best place to learn and practice coding!
 * </code></pre>
 *
 * <p>
 * <strong>Explanation</strong>
 * <br>When we sum the integers <i>4</i> and <i>12</i> , we get the integer <i>16</i> .
 * <br>When we sum the floating-point numbers <i>4.0</i> and <i>4.0</i> , we get <i>8.0</i> .
 * <br>When we concatenate HackerRank with is the best place to learn and practice coding!, we get
 * HackerRank is the best place to learn and practice coding!.
 * </p>
 *
 * <p>
 * <strong>You will not pass this challenge if you attempt to assign the Sample Case values to your
 * variables instead of following the instructions above and reading input from stdin.</strong>
 * </p>
 *
 * @author code36u4r60
 */
public class Day01_DataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;

        /* Read and save an integer, double, and String to your variables.*/
        i2 = scan.nextInt();
        d2 = scan.nextDouble();
        scan.nextLine();
        s2 = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + i2);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + d2);

        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */
        System.out.println(s + s2);
    }

}
